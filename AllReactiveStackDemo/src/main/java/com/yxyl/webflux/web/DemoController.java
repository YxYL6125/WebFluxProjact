package com.yxyl.webflux.web;

import com.yxyl.webflux.entity.Post;
import com.yxyl.webflux.repository.FluxRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * @program: WebFlux
 * @description: 测试Controller
 * @author: YxYL
 * @create: 2022-12-09 21:04
 **/
@RestController
@AllArgsConstructor
public class DemoController {

    private final FluxRepository fluxRepository;
    
    
    @GetMapping("/getAllByFlux")
    public Flux getALlByFlux() {
        Flux<Post> res = fluxRepository.findAll();
        return res;
    }
    
}
