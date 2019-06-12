package com.ryulth.kotlineexample.blog.service

import com.ryulth.kotlineexample.blog.dto.ArticleDto
import com.ryulth.kotlineexample.blog.pojo.model.ArticleData
import com.ryulth.kotlineexample.blog.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(
    private val articleRepository: ArticleRepository
) {
    fun getArticles(): MutableList<ArticleDto> = articleRepository.findAll()
    fun newArticle(articleData: ArticleData): Unit {
        val articleDto =
            ArticleDto(title = articleData.title, content = articleData.content, authorId = articleData.authorId)
        articleRepository.save(articleDto)
    }

}