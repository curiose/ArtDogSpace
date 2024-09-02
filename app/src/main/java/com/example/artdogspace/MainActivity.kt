package com.example.artdogspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artdogspace.ui.theme.ArtDogSpaceTheme
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtDogSpaceTheme {
                Surface(modifier = Modifier) {
                    ArtDogSpaceApp()
                }
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtDogSpaceTheme {
        ArtDogSpaceApp()
    }
}

@Composable
fun ArtDogSpaceApp() {
    var currentStep by remember {
        mutableIntStateOf(1)
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ArtDogSpaceHeader()
        ArtDogSpaceImages(currentStep = currentStep)
        ArtDogSpaceButtons(
            onPreviousClicked = {
                if (currentStep > 1) {
                    currentStep--
                }
            },
            onNextClicked = {
                if (currentStep < 6) {
                    currentStep++
                }
            }
        )
    }

}

@Composable
fun ArtDogSpaceHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Pesik's lifestyle",
            fontWeight = FontWeight.W900,
            color = Color(0xFF8B4513),
            fontSize = 45.sp,
        )
    }
}

@Composable
fun ArtDogSpaceImages(currentStep: Int) {
    val imageModifier = Modifier
        .padding(bottom = 25.dp)
        .fillMaxWidth()
        .size(350.dp)

    val textModifier = androidx.compose.ui.text.TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
    )

    when(currentStep) {
        1 -> {
            Column(
                modifier = Modifier
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = imageModifier,
                    painter = painterResource(R.drawable.pesik_spit),
                    contentDescription = stringResource(R.string.pesik_spit)
                )
                Text(
                    text = stringResource(R.string.pesik_spit),
                    style = textModifier
                )
                Text(
                    text = stringResource(R.string.podpis)
                )
            }
        }
        2 -> {
            Column(
                modifier = Modifier
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = imageModifier,
                    painter = painterResource(R.drawable.pesik_gulyaet),
                    contentDescription = stringResource(R.string.pesik_gulyaet)
                )
                Text(
                    text = stringResource(R.string.pesik_gulyaet),
                    style = textModifier
                )
                Text(
                    text = stringResource(R.string.podpis)
                )
            }
        }
        3 -> {
        Column(
            modifier = Modifier
                .padding(15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = imageModifier,
                painter = painterResource(R.drawable.pesik_v_trave),
                contentDescription = stringResource(R.string.pesik_v_trave)
            )
            Text(
                text = stringResource(R.string.pesik_v_trave),
                style = textModifier
            )
            Text(
                text = stringResource(R.string.podpis)
            )
        }
    }
        4 -> {
                Column(
                    modifier = Modifier
                        .padding(15.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        modifier = imageModifier,
                        painter = painterResource(R.drawable.pesik_otdyhaet),
                        contentDescription = stringResource(R.string.pesik_otdyhaet)
                    )
                    Text(
                        text = stringResource(R.string.pesik_otdyhaet),
                        style = textModifier
                    )
                    Text(
                        text = stringResource(R.string.podpis)
                    )
                }
            }
        5 -> {
            Column(
                modifier = Modifier
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = imageModifier,
                    painter = painterResource(R.drawable.pesik_imperator),
                    contentDescription = stringResource(R.string.pesik_imperator)
                )
                Text(
                    text = stringResource(R.string.pesik_imperator),
                    style = textModifier
                )
                Text(
                    text = stringResource(R.string.podpis)
                )
            }
        }
        6 -> {
            Column(
                modifier = Modifier
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = imageModifier,
                    painter = painterResource(R.drawable.pesik_narisovan),
                    contentDescription = stringResource(R.string.pesik_narisovan)
                )
                Text(
                    text = stringResource(R.string.pesik_narisovan),
                    style = textModifier
                )
                Text(
                    text = stringResource(R.string.podpis)
                )
            }
        }
    }
}

@Composable
fun ArtDogSpaceButtons(
    onPreviousClicked: () -> Unit,
    onNextClicked: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(Color(0xFF8B4513)),
            modifier = Modifier
                .weight(1f)
                .padding(end = 10.dp),
            onClick = onPreviousClicked) {
            Text(text = "Previous")
        }
        Button(
            colors = ButtonDefaults.buttonColors(Color(0xFF8B4513)),
            modifier = Modifier
                .weight(1f)
                .padding(start = 10.dp),
            onClick = onNextClicked) {
            Text(text = "Next")
        }
    }
}