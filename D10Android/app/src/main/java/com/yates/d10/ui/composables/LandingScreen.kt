package com.yates.d10.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.yates.d10.R
import com.yates.d10.ui.theme.D10Theme


@Composable
fun LandingScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(
            modifier = Modifier,
            text = stringResource(id = R.string.landing_screen_banner),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    D10Theme {
        LandingScreen()
    }
}