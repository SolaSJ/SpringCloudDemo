package com.sola.scorder.controller;

import com.netflix.discovery.converters.Auto;
import com.sola.scorder.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sola
 * @date 2018/12/25
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user")
    public String getOrderUser() {
        return userClient.getUser();
    }

}
