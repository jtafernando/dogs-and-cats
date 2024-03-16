package com.example.dogsandcats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.dogsandcats.ui.theme.DogsAndCatsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DogsAndCatsTheme {
                DogsAndCatsApp()
            }
        }
    }

    // This is the main composable and the entry point of our app
    @Composable
    fun DogsAndCatsApp() {
        val navController = rememberNavController() // store state of navController for when a recompose happens

        NavHost(navController = navController, startDestination = "") {
            // Define all the screens that are part of our app here
        }
    }

}