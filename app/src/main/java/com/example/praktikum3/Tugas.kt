package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tugas(modifier: Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {

        // =========================
        // BACKGROUND
        // =========================
        Image(
            painter = painterResource(
                id = R.drawable.butterfly_asthetic
            ),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // =========================
        // ISI HALAMAN
        // =========================
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            //Judul
            Text(text = "UNIVERSITAS MUHAMMADIYAH YOGYAKARTA",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Yellow
            )

            Spacer(
                modifier = Modifier.height(4.dp)
            )

            //Keterangan
            Text(
                text = "Teknologi Informasi",
                fontSize = 16.sp,
                color = Color.DarkGray
            )

            Spacer(
                modifier = Modifier.height(25.dp)
            )

            //Logo
            Image(
                painter = painterResource(
                    id = R.drawable.kelinci
                ),
                contentDescription = "Logo",
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            //Nama
            Text(
                text = "Nama",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            Text(
                text = "Indrianingsih Putri",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Spacer(
                modifier = Modifier.height(5.dp)
            )

            //NIM
            Text(
                text = "20240140125",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            // ==========================
            // FOTO LINGKARAN
            // ==========================
            Image(
                painter = painterResource(
                    id = R.drawable.logo
                ),
                contentDescription = "Foto",
                modifier = Modifier
                    .size(220.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}