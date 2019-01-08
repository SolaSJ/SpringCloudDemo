package com.sola.scuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Sola
 */
@ComponentScan(basePackages = {"com.sola.scuser", "com.sola.sccommon.hystrix"})
@EnableFeignClients(basePackages = {"com.sola.sccommon.client"})
@EnableCircuitBreaker
@SpringBootApplication
@EnableHystrixDashboard
public class ScUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScUserApplication.class, args);
    }

}

