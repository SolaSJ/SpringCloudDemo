package com.sola.scmail.service;

import com.sola.scmail.controller.bean.MailBean;

/**
 * @author Sola
 * @date 2019/01/04
 */
public interface IMailService {

    /**
     * 发送邮件
     *
     * @param mailBean
     * @return
     */
    boolean sendEmail(MailBean mailBean);

}
