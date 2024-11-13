package com.example.miranda_dewi_tugasjetpackcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miranda_dewi_tugasjetpackcompose.R
import com.example.miranda_dewi_tugasjetpackcompose.model.AboutViewModel

@Composable
fun AboutScreen(viewModel: AboutViewModel) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.bg_md),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Content Overlay
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

                Column(
                    modifier = Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Profile Image
                    Image(
                        painter = painterResource(id = R.drawable.profile_md),
                        contentDescription = "Profile Picture",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape)
                            .background(Color.Gray)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    // Username Text
                    Text(
                        text = viewModel.userName,
                        style = MaterialTheme.typography.headlineSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF0D47A1),
                            fontSize = 22.sp
                        ),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    // User Email Text
                    Text(
                        text = viewModel.userEmail,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = Color(0xFF607D8B),
                            fontSize = 16.sp
                        ),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    // University Text
                    Text(
                        text = viewModel.university,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF1E88E5),
                            fontSize = 18.sp
                        ),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Major Text
                    Text(
                        text = viewModel.major,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            color = Color(0xFF455A64),
                            fontSize = 16.sp
                        ),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

