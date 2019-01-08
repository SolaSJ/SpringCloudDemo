package com.sola.scmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Sola
 */
@ComponentScan(basePackages = {"com.sola.scmail", "com.sola.sccommon.hystrix"})
@EnableFeignClients(basePackages = {"com.sola.sccommon.client"})
@EnableCircuitBreaker
@SpringBootApplication
@EnableHystrixDashboard
public class ScMailApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScMailApplication.class, args);
    }

}

