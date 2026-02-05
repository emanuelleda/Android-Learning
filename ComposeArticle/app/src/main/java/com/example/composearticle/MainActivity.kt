package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Interface()

                }

            }
        }
    }
}

@Composable
fun ArticleImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable.bg_compose_background),
        contentDescription = stringResource(R.string.image_description),
        contentScale = ContentScale.FillWidth,
        alignment = Alignment.TopStart,
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
    )
}

@Composable
fun ArticleTitle(text: String) {
    Text(
        text = stringResource(R.string.jetpack_compose_title),
        textAlign = TextAlign.Justify,
        fontSize = 25.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun Paragraph1 (text: String) {
    Text(
        text = stringResource(R.string.paragraph_1),
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp
        )
    )
}

@Composable
fun Paragraph2 (text: String) {
    Text(
        text = stringResource(R.string.paragraph_2),
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun Interface(){
    Column() {
        ArticleImage()
        ArticleTitle(text = stringResource(R.string.jetpack_compose_title))
        Paragraph1(text = stringResource(R.string.paragraph_1))
        Paragraph2(text = stringResource(R.string.paragraph_2))

    }
}



