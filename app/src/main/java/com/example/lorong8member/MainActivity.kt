package com.example.lorong8member

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lorong8member.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_layout)

        val dataClass = mutableListOf<DataClass>(
            DataClass("Kamar 77", R.drawable.kamar77, R.drawable.aidil_77, "Aidil Fitrah", "K1401221053", "Sekolah Bisnis", "Jakarta", R.drawable.davin_77, "Davin Senjaya", "G5402221075", "Aktuaria", "Jakarta"),
            DataClass("Kamar 78", R.drawable.kamar78, R.drawable.japar_78, "Japar Sidik", "E3401221027", "Sumberdaya Hutan & Ekowisata", "Jakarta", R.drawable.sarif_78, "Ahmad Sarifudin", "F1401221017", "Teknik Mesin & Biosistem", "Jakarta"),
            DataClass("Kamar 79", R.drawable.kamar79, R.drawable.andi_79, "Andreas Junaedi Hae", "H4401221059", "Ekonomi Sumberdaya & Lingkungan", "Papua", R.drawable.ravael_79, "Ravael Agave", "C2401221104", "Manajemen Sumberdaya Perairan", "Bekasi"),
            DataClass("Kamar 80", R.drawable.kamar80, R.drawable.roshan_80, "Roshan Zakaria", "G6401221010", "Ilmu Komputer", "Jakarta", R.drawable.fatwa_80, "Muhammad Fatwa Zulkarnain", "E1401221055", "Manajemen Hutan", "Jakarta"),
            DataClass("Kamar 81", R.drawable.kamar81, R.drawable.rozan_81, "Rozan Fuhrer Adilah", "F1401221006", "Teknik Mesin & Biosistem", "Surabaya", R.drawable.syahid_81, "Syahid Tazia Arabi", "F1401221114", "Teknik Mesin & Biosistem", "Jakarta"),
            DataClass("Kamar 82", R.drawable.kamar82, R.drawable.rafi_82, "Muhammad Rafi Fahreza", "G8401221109", "Biokimia", "Jakarta", R.drawable.rian_82, "Yehezkiel Febrian", "A3401221008", "Proteksi Tanaman", "Jakarta"),
            DataClass("Kamar 83", R.drawable.kamar83, R.drawable.yoga_83, "Yoga Ardiansyah", "H2401221001", "Manajemen", "Jambi", R.drawable.undang_83, "Undang Faiz Mugorir Hilmi", "G6401221057", "Ilmu Komputer", "Jakarta"),
            DataClass("Kamar 84", R.drawable.kamar84, R.drawable.haris_84, "Muhammad Haris Sabil Al Karim", "G6401221003", "Ilmu Komputer", "Medan", R.drawable.nahdi_84, "Nahdi Ahmad Dzulqarnain", "H3401221106", "Agribisnis", "Madura"),
            DataClass("Kamar 85", R.drawable.kamar85, R.drawable.ozi_85, "Muhammad Khalid Fauzi", "B0401221004", "Sekolah Kedokteran Hewan & Biomedis", "Jakarta", R.drawable.zico_85, "Zico Bakhtiar Hidayat", "A4401221015", "Arsitektur Lanskap", "Jakarta"),
            DataClass("Kamar 86", R.drawable.kamar86, R.drawable.sahl_86, "Sahl Al Furqan", "K1401221189", "Sekolah Bisnis", "Tangerang", R.drawable.mathew_86, "Mohammad Mathew Elhans", "G5401221009", "Maematika", "Jakarta"),


        )
        val adapter = Adapter(dataClass){
            val intent = Intent(this, Detail::class.java).apply {
                putExtra("contoh", it)
                startActivity(this)
            }
        }
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
    }
}