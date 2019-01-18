package com.sola.scmail.controller;

import com.sola.sccommon.bean.param.MailBean;
import com.sola.sccommon.client.UserClient;
import com.sola.sccommon.bean.ResponseMessage;
import com.sola.sccommon.icontroller.mail.IMailController;
import com.sola.scmail.kafka.producer.Producer;
import com.sola.scmail.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sola
 * @date 2019/01/03
 */
@RestController
public class MailController implements IMailController {

    @Autowired
    private IMailService mailService;
    @Autowired
    private UserClient userClient;
    @Autowired
    private Producer producer;

    @Override
    @GetMapping("/mail/1")
    public ResponseMessage getMail() {
        return new ResponseMessage("this is a email");
    }

    @Override
    @PostMapping("/mail")
    public boolean sendEmail(@RequestBody @Validated MailBean mailBean) {
        return mailService.sendEmail(mailBean);
    }

    @Override
    @PostMapping("/topic/{msg}")
    public boolean sendTopic(@PathVariable("msg") String msg) {
        producer.send(msg);
        return true;
    }

}
