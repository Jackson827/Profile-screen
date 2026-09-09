package com.domentro.businesscard.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.domentro.businesscard.R

@Composable
fun ProfileHeader(modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(bottom = 16.dp, top = 16.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .border(
                    BorderStroke(2.dp, MaterialTheme.colorScheme.primary),
                    CircleShape
                )
                .size(120.dp)
                .clip(CircleShape)
                .padding(bottom = 8.dp)
        )
        Text(
            text = "Jackson Example",
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.headlineMedium,
        )
        Text(text = "Backend & AI engineer")
    }
}


@Preview(showBackground = true)
@Composable
fun ProfileHeaderPreview() {
    ProfileHeader()
}