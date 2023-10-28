package com.example.medium_challenge.Data

import androidx.annotation.DrawableRes

data class Product(
    val text:String,
    val quant:String,
    val price:String,
    @DrawableRes val img:Int
)
