package com.yxyl.mvc.web

import com.yxyl.mvc.entity.Post
import com.yxyl.mvc.repository.MVCRepository
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.NonNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.reflect.KProperty

@RestController
@AllArgsConstructor
class DemoController() {

    @Autowired
    private lateinit var repository: MVCRepository

    @GetMapping("/getAllByMvc")
    fun getAll(): List<Post> = repository.findAll();

}

