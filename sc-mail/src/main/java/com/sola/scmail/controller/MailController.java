package com.sola.scmail.controller;

import com.sola.sccommon.bean.param.MailBean;
import com.sola.sccommon.client.UserClient;
import com.sola.sccommon.bean.ResponseMessage;
import com.sola.sccommon.icontroller.mail.IMailController;
import com.sola.scmail.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}
