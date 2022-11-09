package com.example.compose_news_application.model

import com.example.compose_news_application.R


data class NewsData(
    val id: Int,
    val image: Int = R.drawable.movie4,
    val author: String,
    val title: String,
    val description: String,
    val publishedAt: String
)
