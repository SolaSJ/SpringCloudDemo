package com.sola.scmail.service.impl;

import com.sola.sccommon.bean.param.MailBean;
import com.sola.scmail.service.IMailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author Sola
 * @date 2019/01/04
 */
@Slf4j
@Service
public class MailServiceImpl implements IMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public boolean sendEmail(MailBean mailBean) {
        SimpleMailMessage msg = new SimpleMailMessage();
        BeanUtils.copyProperties(mailBean, msg);
        javaMailSender.send(msg);
        return true;
    }

}
