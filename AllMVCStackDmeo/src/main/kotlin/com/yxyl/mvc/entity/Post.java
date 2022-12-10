package com.yxyl.mvc.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public
class Post {
    @Id
    private String id;
    private String title;
    private String content;
    
    @CreatedDate
    private LocalDateTime createDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String updatedBy;
}