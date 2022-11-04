package com.turgunoff.musicplayer.ui

import androidx.annotation.DrawableRes

/**
 * Created by Eldor Turgunov.
 * Music Player
 * eldorturgunov777@gmail.com
 */
data class Album(
    val title: String,
    val singer: String,
    @DrawableRes val image: Int
)