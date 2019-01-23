package com.sola.sccommon.client;

import com.sola.sccommon.bean.ResponseMessage;
import com.sola.sccommon.bean.param.MailBean;
import com.sola.sccommon.hystrix.MailServiceHystrix;
import com.sola.sccommon.icontroller.mail.IMailController;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Sola
 * @date 2019/01/08
 */
@FeignClient(value = "sc-mail", fallback = MailServiceHystrix.class)
public interface MailClient extends IMailController {

    /**
     * 获取邮件
     *
     * @return
     */
    @Override
    @RequestLine("GET /mail/1")
    ResponseMessage getMail();

    /**
     * 发送邮件
     *
     * @param mailBean
     * @return
     */
    @Override
    @RequestLine("POST /mail")
    boolean sendEmail(MailBean mailBean);

    /**
     * 发送消息
     *
     * @param msg
     * @return
     */
    @Override
    @RequestLine("POST /topic/{msg}")
    boolean sendTopic(String msg);

}
