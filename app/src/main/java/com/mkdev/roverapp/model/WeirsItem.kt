package com.mkdev.roverapp.model

import com.google.gson.annotations.SerializedName

data class WeirsItem(

    @field:SerializedName("x")
    val X: Int = 0,

    @field:SerializedName("y")
    val Y: Int = 0
)