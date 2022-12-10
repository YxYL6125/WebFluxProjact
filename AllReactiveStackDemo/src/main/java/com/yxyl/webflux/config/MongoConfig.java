package com.yxyl.webflux.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.ReactiveAuditorAware;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import reactor.core.publisher.Mono;

/**
 * @program: WebFlux
 * @description:
 * @author: YxYL
 * @create: 2022-12-10 09:01
 **/
@Configuration
@EnableReactiveMongoRepositories(basePackages = "com.yxyl.webflux.repository")
public class MongoConfig extends AbstractReactiveMongoConfiguration {


    @Value("${spring.data.mongodb.uri}")
    String uri;

    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create(uri);
    }

    @Override
    protected String getDatabaseName() {
        return "blog";
    }

    @Bean
    public ReactiveAuditorAware<String> auditorAware() {
        return () -> Mono.just("hantsy");
    }
    
//    @Autowired
//    private static CommandLineRunner dataInitializr;
//    public static void main(String[] args) {
//        try {
//            dataInitializr.run(args);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

}
