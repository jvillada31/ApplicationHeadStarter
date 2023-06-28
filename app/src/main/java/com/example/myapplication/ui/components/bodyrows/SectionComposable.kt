package com.example.myapplication.ui.components.bodyrows

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SectionComposable(
    sectionTitle: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .shadow(elevation = 16.dp)
            .defaultMinSize(minHeight = 88.dp),
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
    ) {
        Text(
            text = sectionTitle,
            modifier = Modifier.padding(top = 8.dp, start = 16.dp, bottom = 8.dp),
            color = Color.Black.copy(alpha = 0.9f),
            fontSize = 16.sp,
            fontWeight = FontWeight(600),
        )
        Divider(
            thickness = 1.dp,
            color = Color.LightGray
        )
    }
}
