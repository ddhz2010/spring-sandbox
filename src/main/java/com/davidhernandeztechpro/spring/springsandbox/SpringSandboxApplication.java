package com.davidhernandeztechpro.spring.springsandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:application-context.xml")
public class SpringSandboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSandboxApplication.class, args);
    }

}
