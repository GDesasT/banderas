package com.example.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.fillMaxSize
import com.example.banderas.ui.theme.BanderasTheme
import android.view.LayoutInflater

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BanderasTheme {
                MyActivityMainView(Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun MyActivityMainView(modifier: Modifier = Modifier) {
    AndroidView(
        factory = { context ->
            val inflater = LayoutInflater.from(context)
            inflater.inflate(R.layout.activity_main, null)
        },
        modifier = modifier
    )
}
