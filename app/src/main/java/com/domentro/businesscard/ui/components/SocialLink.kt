package com.domentro.businesscard.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Facebook
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Subscriptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SocialLink(){
    Row (modifier = Modifier.padding(16.dp)){
        Column() {
            Row(){
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Share"
                )
                Text(
                    text = "Connect"
                )
            }
            Row(){
                Icon(
                    imageVector = Icons.Default.Facebook,
                    contentDescription = "Facebook"
                )
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Message"
                )
                Icon(
                    imageVector = Icons.Default.Subscriptions,
                    contentDescription = "YouTube"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SocialLinkPreview() {
    SocialLink()
}