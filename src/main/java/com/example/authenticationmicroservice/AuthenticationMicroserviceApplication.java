package com.example.authenticationmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class })
public class AuthenticationMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationMicroserviceApplication.class, args);
    }

}
