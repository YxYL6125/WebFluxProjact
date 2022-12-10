package com.yxyl.webflux.repository;

import com.yxyl.webflux.entity.Post;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.awt.print.Pageable;

/**
 * @program: WebFlux
 * @description:
 * @author: YxYL
 * @create: 2022-12-10 09:07
 **/
@Repository
public interface FluxRepository extends ReactiveMongoRepository<Post, String> {

    //传统查询
    Flux<Post> findByTitleContains(String title);

    //分页查询
    Flux<Post> findByTitleContains(String title, Pageable page);

}
