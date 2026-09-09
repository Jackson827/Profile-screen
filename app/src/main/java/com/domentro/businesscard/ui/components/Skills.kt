package com.domentro.businesscard.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Skills(){
    Column {
        Text(text = "Skills")
        Row {
            Text(text = "Python")
            Text(text = "Kotlin")
            Text(text = "FastAPI")
            Text(text = "Compose MP")
        }
        ElevatedButton(onClick = { /*TODO*/ } ) {
            Text(text = "View my work")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SkillsPreview() {
    Skills()
}