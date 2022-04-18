package com.beyzayuksel.login_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// spring security(login page) exclude:dahil etmemek
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
})

public class LoginSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginSpringBootApplication.class, args);
    }
}
