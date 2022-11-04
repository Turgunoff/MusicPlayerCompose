package com.turgunoff.musicplayer.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.turgunoff.musicplayer.R
import com.turgunoff.musicplayer.ui.theme.Silver
import com.turgunoff.musicplayer.ui.theme.Typography

/**
 * Created by Eldor Turgunov.
 * Music Player
 * eldorturgunov777@gmail.com
 */
@Composable
fun HeaderSection(title: String, modifier: Modifier? = null) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier ?: Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            style = Typography.h1,
            modifier = Modifier.weight(1f)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_qr_code_scanner),
            contentDescription = "QR Code Scanner",
            modifier = Modifier
                .clip(CircleShape)
                .padding(end = 8.dp)
                .border(1.dp, Silver, CircleShape)
                .padding(4.dp)
                .size(24.dp),
            tint = Silver
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_account_circle),
            contentDescription = "Profile",
            modifier = Modifier
                .clip(CircleShape)
                .border(1.dp, Silver, CircleShape)
                .padding(4.dp)
                .size(24.dp),
            tint = Silver
        )
    }
}