package com.sola.sccommon.hystrix;

import com.sola.sccommon.bean.ResponseMessage;
import com.sola.sccommon.bean.param.MailBean;
import com.sola.sccommon.client.MailClient;
import com.sola.sccommon.client.UserClient;
import org.springframework.stereotype.Component;

/**
 * @author Sola
 * @date 2018/12/25
 */
@Component
public class MailServiceHystrix implements MailClient {

    @Override
    public ResponseMessage getMail() {
        return new ResponseMessage("service is unavailable");
    }

    @Override
    public boolean sendEmail(MailBean mailBean) {
        return false;
    }

    @Override
    public boolean sendTopic(String msg) {
        return false;
    }

}
