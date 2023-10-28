package com.example.medium_challenge.Data

import androidx.annotation.DrawableRes

data class Offer(
    val text:String,
    val price:String,
    val sold:String,
    @DrawableRes val img:Int

)
