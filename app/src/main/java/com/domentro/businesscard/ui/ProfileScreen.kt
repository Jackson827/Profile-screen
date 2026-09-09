package com.domentro.businesscard.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.domentro.businesscard.ui.components.AboutMe
import com.domentro.businesscard.ui.components.Contact
import com.domentro.businesscard.ui.components.ProfileHeader
import com.domentro.businesscard.ui.components.Skills
import com.domentro.businesscard.ui.components.SocialLink

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        ProfileHeader()
        AboutMe()
        Skills()
        Contact()
        SocialLink()
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}