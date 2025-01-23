package com.testkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootKafkaApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaApp.class, args);
    }

}
