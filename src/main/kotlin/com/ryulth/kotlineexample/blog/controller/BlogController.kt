package com.ryulth.kotlineexample.blog.controller

import com.ryulth.kotlineexample.blog.pojo.model.ArticleData
import com.ryulth.kotlineexample.blog.service.ArticleService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class BlogController(
    private val articleService: ArticleService
){
    @GetMapping("/articles")
    fun articles() = articleService.getArticles();

    @PostMapping("/article")
    fun newArticle(@RequestBody articleData: ArticleData) = articleService.newArticle(articleData)
}