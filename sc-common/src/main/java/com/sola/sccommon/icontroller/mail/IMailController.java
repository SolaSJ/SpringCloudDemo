package com.sola.sccommon.icontroller.mail;

import com.sola.sccommon.bean.ResponseMessage;
import com.sola.sccommon.bean.param.MailBean;

/**
 * @author Sola
 * @date 2019/01/08
 */
public interface IMailController {

    ResponseMessage getMail();

    boolean sendEmail(MailBean mailBean);

    boolean sendTopic(String msg);

}
