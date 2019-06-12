package com.ryulth.kotlineexample.blog.dto

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class ArticleDto(
    @Id @GeneratedValue var id: Long? = null,
    var title : String,
    var content : String,
    var authorId : Long
)