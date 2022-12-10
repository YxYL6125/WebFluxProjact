package com.yxyl.mvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories(basePackages = arrayOf("com.yxyl.mvc.repository"))
class AllMvcStackDmeoApplication

fun main(args: Array<String>) {
    runApplication<AllMvcStackDmeoApplication>(*args)
}
