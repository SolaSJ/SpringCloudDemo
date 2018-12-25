package com.sola.scorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Sola
 */
@EnableFeignClients
@SpringBootApplication
public class ScOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScOrderApplication.class, args);
    }

}

