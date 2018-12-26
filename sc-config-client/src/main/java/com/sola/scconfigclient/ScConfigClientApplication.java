package com.sola.scconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sola
 */
@RestController
@SpringBootApplication
public class ScConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScConfigClientApplication.class, args);
    }

    @Value("${hello}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }

}

