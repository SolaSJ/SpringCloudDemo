package com.sola.scregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Sola
 */
@EnableEurekaServer
@SpringBootApplication
public class ScRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScRegistryApplication.class, args);
    }

}

