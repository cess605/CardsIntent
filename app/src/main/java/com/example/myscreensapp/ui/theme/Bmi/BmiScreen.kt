package com.example.myscreensapp.ui.theme.Bmi

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myscreensapp.ui.theme.MyScreensAppTheme

@Composable
fun BmiScreen(navController: NavHostController) {
    var weight by remember { mutableStateOf(70.0) }
    var height by remember { mutableStateOf(170.0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "BMI Calculator", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Weight (kg):")
            BasicTextField(
                value = weight.toString(),
                onValueChange = { weight = it.toDoubleOrNull() ?: 0.0 },
                textStyle = TextStyle(fontSize = 18.sp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Height (cm):")
            BasicTextField(
                value = height.toString(),
                onValueChange = { height = it.toDoubleOrNull() ?: 0.0 },
                textStyle = TextStyle(fontSize = 18.sp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        var result by remember {
            mutableStateOf("0")
        }

        Button(
            onClick = {
                      val result = weight.toInt() / (height.toFloat() * height.toFloat())
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(text = "Calculate BMI")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Display the BMI result here
        Text(
            text = "Your BMI: $result",
            fontSize = 18.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BmiCalculatorPreview() {
    MyScreensAppTheme {
        BmiScreen(rememberNavController())
    }
}
