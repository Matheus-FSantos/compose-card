package io.github.matheusfsantos.composecard.data

import androidx.annotation.DrawableRes

data class Publisher(
    val name: String,
    val jobTitle: String,
    @DrawableRes val image: Int,
)