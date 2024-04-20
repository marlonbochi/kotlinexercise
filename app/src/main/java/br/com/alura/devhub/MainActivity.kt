package br.com.alura.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import br.com.alura.devhub.ui.theme.DevHubTheme


// imports

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileInformation()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileInformation() {
    Column (
        modifier =Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Image(painterResource(R.drawable.image_profile), contentDescription = "Profile image")
        }
        Row {
            Text(text = "Marlon Bochi", style = MaterialTheme.typography.displayMedium, fontWeight = FontWeight.Bold)
        }
        Row {
            Text("marlonbochi", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
        }
        Row {
            Text("Senior software developer",  style = MaterialTheme.typography.titleMedium)
        }

    }
}