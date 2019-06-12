package com.ryulth.kotlineexample.blog.pojo.model

import java.util.concurrent.atomic.AtomicLong

val counter = AtomicLong()
data class ArticleData(
    val id : Long? = 0,
    val title : String,
    val content : String,
    val authorId : Long
)