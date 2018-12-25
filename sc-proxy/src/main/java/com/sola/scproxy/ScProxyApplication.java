package com.sola.scproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Sola
 */
@EnableZuulProxy
@SpringBootApplication
public class ScProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScProxyApplication.class, args);
    }

}

