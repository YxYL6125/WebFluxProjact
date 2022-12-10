package com.yxyl.webflux.init;

import com.yxyl.webflux.entity.Post;
import com.yxyl.webflux.repository.FluxRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.Date;

/**
 * @program: WebFlux
 * @description:
 * @author: YxYL
 * @create: 2022-12-10 09:15
 **/
@Slf4j
@Component
@AllArgsConstructor
public class DataInitializr implements CommandLineRunner {

    private final FluxRepository repository;

    @Override
    public void run(String... args) throws Exception {
        log.info("开始初始化数据库....");
        this.repository
                .deleteAll()
                .thenMany(
                        Flux.just("当前是第" + 1 + "个，时间是:" + new Date(),
                                        "当前是第" + 2 + "个，时间是:" + new Date(),
                                        "当前是第" + 3 + "个，时间是:" + new Date(),
                                        "当前是第" + 4 + "个，时间是:" + new Date(),
                                        "当前是第" + 5 + "个，时间是:" + new Date(),
                                        "当前是第" + 6 + "个，时间是:" + new Date(),
                                        "当前是第" + 7 + "个，时间是:" + new Date(),
                                        "当前是第" + 8 + "个，时间是:" + new Date(),
                                        "当前是第" + 9 + "个，时间是:" + new Date(),
                                        "当前是第" + 10 + "个，时间是:" + new Date(),
                                        "当前是第" + 11 + "个，时间是:" + new Date())
                                .flatMap(
                                        title -> this.repository.save(Post.builder().title(title).content("内容是:" + title).build())
                                )
                )
                .log()
                .subscribe(
                        null, null, () -> log.info("初始化完成")
                );
    }


}
