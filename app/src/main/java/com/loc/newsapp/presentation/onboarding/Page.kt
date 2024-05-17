package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Welcome to Kabar",
        description = "Discover the latest news articles. Browse through various categories and stay informed.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Read, Save, and Share",
        description = "Click on any article to read more. Use the world icon to view the full article on the web. Bookmark articles to save them and share articles with friends easily.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Search and Manage",
        description = "Use the search bar to find specific articles. Access saved articles in the Bookmarks tab. Manage your bookmarks by clicking the bookmark icon again to remove them.",
        image = R.drawable.onboarding3
    ),

)
