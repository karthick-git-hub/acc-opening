package com.ao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ao")
public class AccountOpeningApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountOpeningApplication.class, args);
    }
}