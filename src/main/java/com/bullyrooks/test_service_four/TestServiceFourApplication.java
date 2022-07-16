package com.bullyrooks.test_service_four;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestServiceFourApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestServiceFourApplication.class, args);
    }

}
