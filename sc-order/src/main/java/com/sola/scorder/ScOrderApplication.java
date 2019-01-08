package com.sola.scorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author Sola
 */
@ComponentScan(basePackages = {"com.sola.scorder", "com.sola.sccommon.hystrix"})
@EnableFeignClients(basePackages = {"com.sola.sccommon.client"})
@EnableCircuitBreaker
@SpringBootApplication
@EnableHystrixDashboard
public class ScOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScOrderApplication.class, args);
    }

}

