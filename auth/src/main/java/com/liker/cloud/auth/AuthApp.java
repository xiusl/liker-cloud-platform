package com.liker.cloud.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@Slf4j
@EnableEurekaClient
@SpringBootApplication()
@ComponentScan(basePackages = {"com.liker.cloud"})
public class AuthApp {
    public static void main(String[] args) {
        SpringApplication.run(AuthApp.class, args);
        log.info("===================== Auth Service Start Success !========================");
    }
}
