package com.sola.scmail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sola
 * @date 2019/01/03
 */
@RestController
public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping("/sendEmail")
    @ResponseBody
    public boolean sendEmail() {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom("solasj@qq.com");
        msg.setBcc();
        msg.setTo("jie.su@karakal.com.cn");
        msg.setSubject("Java技术栈投稿");
        msg.setText("技术分享");
        try {
            javaMailSender.send(msg);
        } catch (MailException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
        return true;
    }

}
