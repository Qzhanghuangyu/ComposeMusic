package com.quick.app.feature.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainRouter(finishPage: () -> Unit ) {
    MainScreen(finishPage = finishPage)
}

@Composable
fun MainScreen(finishPage: () -> Unit = {}) {
    Text(text = "MainScreen")
    Button(onClick = { finishPage() }, modifier = Modifier.padding(top = 150.dp)) { Text(text = "关闭") }
}
