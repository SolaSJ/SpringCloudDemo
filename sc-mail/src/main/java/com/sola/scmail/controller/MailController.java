package com.sola.scmail.controller;

import com.sola.scmail.controller.bean.MailBean;
import com.sola.scmail.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sola
 * @date 2019/01/03
 */
@RestController
public class MailController {

    @Autowired
    private IMailService mailService;

    @PostMapping("/email")
    public boolean sendEmail(@RequestBody @Validated MailBean mailBean) {
        return mailService.sendEmail(mailBean);
    }

}
