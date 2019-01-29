package com.spiderweb.queue.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spiderweb.queue"})
public class Startup {

    public static void main(String... args) {
        SpringApplication.run(Startup.class, args);
    }
}
