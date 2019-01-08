package com.sola.scuser.common.aop;

import com.sola.sccommon.bean.ResultBean;
import com.sola.sccommon.bean.param.MailBean;
import com.sola.sccommon.client.MailClient;
import com.sola.sccommon.consts.Operator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.mail.MailException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Sola
 * @date 2018/12/09
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @Value("${mail.sender}")
    private String mailSender;
    @Value("${mail.receiver}")
    private String[] mailReceiver;

    @Autowired
    private MailClient mailClient;

    @SuppressWarnings("Duplicates")
    @ExceptionHandler(Exception.class)
    public Object globalHandleException(Exception e) {
        HttpStatus httpStatus;
        String message;

        if (e instanceof ConstraintViolationException) {
            Set<ConstraintViolation<?>> constraintViolations = ((ConstraintViolationException) e).getConstraintViolations();
            message = "参数检验异常, " + Optional.ofNullable(constraintViolations).orElse(Collections.emptySet())
                    .stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(Operator.COMMA));
            httpStatus = HttpStatus.BAD_REQUEST;
        } else if (e instanceof MethodArgumentNotValidException) {
            List<ObjectError> allErrors = ((MethodArgumentNotValidException) e).getBindingResult().getAllErrors();
            message = "参数检验异常, " + Optional.of(allErrors).orElse(Collections.emptyList())
                    .stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining(Operator.COMMA));
            httpStatus = HttpStatus.BAD_REQUEST;
        } else if (e instanceof MailException) {
            message = "发送邮件异常, " + e.getMessage();
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        } else {
            log.error("未知异常, {}", e.getMessage(), e);
            MailBean mailBean = MailBean.builder().from(mailSender).to(mailReceiver).subject("未知异常").text(e.toString()).build();
            mailClient.sendEmail(mailBean);
            message = "未知异常, 请查看邮件";
            httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return ResultBean.builder().msg(message).httpStatus(httpStatus).build();
    }

}
