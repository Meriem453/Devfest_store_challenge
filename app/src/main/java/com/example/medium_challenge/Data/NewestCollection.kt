package com.example.medium_challenge.Data

import androidx.annotation.DrawableRes

data class NewestCollection (
    val text:String,
    val items:String,
    @DrawableRes val img:Int
)