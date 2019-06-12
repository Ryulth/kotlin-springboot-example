package com.ryulth.kotlineexample.blog.repository

import com.ryulth.kotlineexample.blog.entity.ArticleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query

interface ArticleRepository : JpaRepository<ArticleEntity,Long>{
    fun findByTitle(title : String) : ArticleEntity?
    @Modifying
    @Query("delete from ArticleEntity a where a.id =?1")
    override fun deleteById(id : Long)
}
