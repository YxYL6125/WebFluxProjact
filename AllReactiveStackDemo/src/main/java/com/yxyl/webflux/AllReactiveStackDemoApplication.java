package com.yxyl.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableReactiveMongoAuditing
public class AllReactiveStackDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AllReactiveStackDemoApplication.class, args);
    }

}
