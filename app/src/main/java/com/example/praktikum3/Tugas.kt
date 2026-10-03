package com.example.praktikum3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tugas() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        //Judul
        Text(text = "UNIVERSITAS MUHAMMADIYAH YOGYAKARTA",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )

        Spacer(
            modifier = Modifier.height(4.dp)
        )

        //Keterangan
        Text(
            text = "Teknologi Informasi",
            fontSize = 14.sp,
            color = Color.DarkGray
        )

        Spacer(
            modifier = Modifier.height(25.dp)
        )

        //Logo
        Image(
            painter = painterResource(
                id = R.drawable.logo
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

        //Foto Berbentuk Lingkaran
        Box(
            modifier = Modifier
                .size(20.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    color = Color.LightGray,
                    shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.foto
                ),
                contentDescription = "Foto",
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}