package com.domentro.businesscard.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Web
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Contact(){
    Row(modifier = Modifier) {
        Column {
            Text(
                text = "Contact",
                fontSize = 20.sp
            )
            Row {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email"
                )
                Text(
                    text = "example@gmail.com",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            Row {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Phone"
                )
                Text(
                    text = "+255700000000",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            Row {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "Location"
                )
                Text(
                    text = "Dar es salaam, Tanzania",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            Row {
                Icon(
                    imageVector = Icons.Default.Web,
                    contentDescription = "Website"
                )
                Text(
                    text = "https://www.example.com",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContactPreview() {
    Contact()
}