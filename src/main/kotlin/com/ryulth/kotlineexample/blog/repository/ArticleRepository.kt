package com.ryulth.kotlineexample.blog.repository

import com.ryulth.kotlineexample.blog.dto.ArticleDto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query

interface ArticleRepository : JpaRepository<ArticleDto,Long>{
    fun findByTitle(title : String) : ArticleDto?
    @Modifying
    @Query("delete from ArticleDto a where a.id =?1")
    override fun deleteById(id : Long)
}
