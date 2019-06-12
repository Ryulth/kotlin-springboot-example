package com.ryulth.kotlineexample.blog.repository

import com.ryulth.kotlineexample.blog.dto.ArticleDto
import org.springframework.data.jpa.repository.JpaRepository

interface ArticleRepository : JpaRepository<ArticleDto,Long>{
    fun findByTitle(title : String) : ArticleDto?

}
