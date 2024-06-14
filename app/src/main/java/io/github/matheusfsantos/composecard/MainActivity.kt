package io.github.matheusfsantos.composecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import io.github.matheusfsantos.composecard.data.Publisher
import io.github.matheusfsantos.composecard.ui.components.CustomCard
import io.github.matheusfsantos.composecard.ui.theme.ComposeCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.8f)),
                contentAlignment = Alignment.Center
            ) {
                val publisher: Publisher = Publisher(
                    name = "Matheus Ferreira",
                    jobTitle = "Full-Stack Developer",
                    image = R.drawable.my_picture
                );

                CustomCard(
                    modifier = Modifier.fillMaxWidth(0.8f),
                    title = "Shadows & Lightnings",
                    text = "Jetpack Compose is Android's recommended modern toolkit for building native UI. It simplifies and accelerates UI development on Android.",
                    publisher = publisher,
                    image = R.drawable.elephant)
            }
        }
    }
}
