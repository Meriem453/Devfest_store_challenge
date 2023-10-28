package com.example.medium_challenge.Data

import androidx.annotation.DrawableRes

data class NewestItem(
    val text:String,
    val price:String,
    @DrawableRes val img:Int
)
