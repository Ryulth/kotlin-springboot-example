package com.ryulth.kotlineexample.blog.dto

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Article")
class ArticleDto(
    @Id @GeneratedValue var id: Long? = null,
    var title : String,
    var content : String,
    var authorId : Long
)