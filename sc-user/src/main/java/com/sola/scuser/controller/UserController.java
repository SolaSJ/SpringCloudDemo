package com.sola.scuser.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sola
 * @date 2018/12/25
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{userId}")
    public String getUser(@PathVariable Long userId) {
        log.info("{}", userId);
        return "user 001";
    }

}
