package com.sola.scdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Sola
 */
@EnableTurbine
@EnableHystrixDashboard
@SpringBootApplication
public class ScDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScDashboardApplication.class, args);
    }

}

