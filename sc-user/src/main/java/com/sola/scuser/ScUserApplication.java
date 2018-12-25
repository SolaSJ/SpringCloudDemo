package com.sola.scuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Sola
 */
@SpringBootApplication
public class ScUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScUserApplication.class, args);
    }

}

