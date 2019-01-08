package com.sola.scorder.common.aop;

import com.alibaba.fastjson.JSON;
import com.sola.sccommon.bean.ResponseMessage;
import com.sola.sccommon.bean.ResultBean;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Optional;

/**
 * 统一处理controller返回结果
 *
 * @author Sola
 * @date 2018/12/07
 */
@RestControllerAdvice
public class ControllerRespAop implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    @SuppressWarnings("Duplicates")
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (o instanceof ResultBean) {
            ResultBean rb = (ResultBean) o;
            serverHttpResponse.setStatusCode(rb.getHttpStatus());
            return new ResponseMessage(Optional.ofNullable(rb.getMsg()).orElse(""));
        }

        // 处理controller返回为字符串时, 转换报异常的bug
        if (o instanceof String) {
            return JSON.toJSONString(new ResponseMessage((String) o));
        }

        return o;
    }

}
