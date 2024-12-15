package com.quick.app.feature.splash

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quick.app.R
import com.quick.app.util.DateUtil

@Composable
fun SplashRouter(toMain: () -> Unit ) {
    SplashScreen(year = DateUtil.getCurrentYear(), toMain)
}

@Composable
fun SplashScreen(
    year: Int = 2024,
    toMain: () -> Unit ={}
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {

        Image(
            painter = painterResource(id = R.drawable.splash_banner), contentDescription = null,
            modifier = Modifier
                .padding(top = 120.dp)
                .align(Alignment.TopCenter)
        )

        Image(
            painter = painterResource(R.drawable.splash_logo),
            contentDescription = null,
            modifier = Modifier
                .padding(bottom = 70.dp)
                .align(Alignment.BottomCenter)
                .clickable {
                    toMain()
                }
        )

        Text(
            text = stringResource(R.string.copyright, year),
            color = MaterialTheme.colorScheme.onPrimary,
            style = TextStyle(fontSize = 12.sp),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 40.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen()
}

