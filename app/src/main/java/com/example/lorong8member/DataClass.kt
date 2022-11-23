package com.example.lorong8member

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataClass(
    val nomorKamar: String,
    val gambarKamar: Int,
    val gambar: Int,
    val nama: String,
    val nim: String,
    val departemen: String,
    val asal: String,
    val gambar2: Int,
    val nama2: String,
    val nim2: String,
    val departemen2: String,
    val asal2: String
): Parcelable