package com.sola.scorder.controller;

import com.sola.sccommon.bean.param.MailBean;
import com.sola.sccommon.client.MailClient;
import com.sola.sccommon.client.UserClient;
import com.sola.sccommon.bean.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sola
 * @date 2018/12/25
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserClient userClient;
    @Autowired
    private MailClient mailClient;

    @GetMapping("/user")
    public ResponseMessage getOrderUser() {
        String[] to = {"solasj@qq.com"};
        MailBean build = MailBean.builder().text("测试发送").subject("hello").from("solasj@qq.com").to(to).build();
        // mailClient.sendEmail(build);
        ResponseMessage mail = mailClient.getMail();
        log.info("{}", mail);
        return userClient.getUser();
    }

}
