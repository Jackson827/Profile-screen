package com.domentro.businesscard.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.dp


@Composable
fun AboutMe(modifier: Modifier = Modifier){
    Row(modifier = modifier.padding(16.dp)) {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Person"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = "About me",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "I'm backend and AI engineer passionated about building scalable products, exploring new technologies and solving real-world problems.",
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AboutMePreview() {
    AboutMe()
}