package com.yxyl.mvc.repository

import com.yxyl.mvc.entity.Post
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface MVCRepository : MongoRepository<Post, String> {

}
