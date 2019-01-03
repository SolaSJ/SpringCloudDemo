package com.sola.scuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Sola
 */
@EnableCircuitBreaker
@SpringBootApplication
@EnableHystrixDashboard
public class ScUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScUserApplication.class, args);
    }

}

