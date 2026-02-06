package com.example.quadrantesnocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantesnocompose.ui.theme.QuadrantesNoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantesNoComposeTheme {
                MainInterface()
            }
        }
        }
    }


@Composable
fun MainInterface() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            Quadrante(
                titulo = stringResource(R.string.text_composable),
                corpo = stringResource(R.string.q1_text),
                cor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Quadrante(
                titulo = stringResource(R.string.image_composable),
                corpo = stringResource(R.string.q2_text),
                cor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Quadrante(
                titulo = stringResource(R.string.row_composable),
                corpo = stringResource(R.string.q3_text),
                cor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Quadrante(
                titulo = stringResource(R.string.column_composable),
                corpo = stringResource(R.string.q4_text),
                cor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}



@Composable
private fun Quadrante(titulo: String,
                      corpo: String,
                      cor: Color,
                      modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(cor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = titulo, fontWeight = FontWeight.Bold)
        Text(text = corpo, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    QuadrantesNoComposeTheme {
        MainInterface()
    }
}

