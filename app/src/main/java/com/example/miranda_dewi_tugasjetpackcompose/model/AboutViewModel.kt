// AboutViewModel.kt
package com.example.miranda_dewi_tugasjetpackcompose.model

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class AboutViewModel : ViewModel() {
    var userName by mutableStateOf("Miranda Dewi")
    var userEmail by mutableStateOf("mirandadewi190@gmail.com")
    var university by mutableStateOf("Universitas Muhammadiyah Sumatera Utara")
    var major by mutableStateOf("Teknologi Informasi")
}
