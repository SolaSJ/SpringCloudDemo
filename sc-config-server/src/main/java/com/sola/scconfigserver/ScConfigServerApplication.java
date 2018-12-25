package com.sola.scconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Sola
 */
@EnableConfigServer
@SpringBootApplication
public class ScConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScConfigServerApplication.class, args);
    }

}

