package com.example.compose_news_application.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.compose_news_application.R
import com.example.compose_news_application.model.MockData
import com.example.compose_news_application.model.NewsData

@Composable
fun TopNews(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Top News",
            fontWeight = FontWeight.Bold
        )
        LazyColumn(){
            items(MockData.topNewsList){newsData ->
                    NewsItems(newsData = newsData)
            }
        }
    }
}

@Composable
fun NewsItems(newsData: NewsData) {
    Box(
        modifier = Modifier
            .height(200.dp)
            .padding(8.dp)
    ) {
        Image(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            painter = painterResource(id = newsData.image), contentDescription = newsData.title,
            contentScale = ContentScale.FillBounds
        )
        Text(
            text = newsData.publishedAt,
            color = Color.White,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Start
        )
        Text(
            modifier = Modifier.align(Alignment.BottomStart),
            text = newsData.title,
            color = Color.White,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TopNewsPreview() {
   // TopNews(rememberNavController())
    NewsItems(newsData = NewsData(
        7,
        R.drawable.movie1,
        author = "Thomas Barrabi",
        title = "Sen. Murkowski slams Dems over 'show votes' on federal election bills - Fox News",
        description = "Sen. Lisa Murkowski, R-Alaska, slammed Senate Democrats for pursuing “show votes” on federal election bills on Wednesday as Republicans used the filibuster to block consideration the John Lewis Voting Rights Advancement Act.",
        publishedAt = "2021-11-04T01:57:36Z"
    ))
}