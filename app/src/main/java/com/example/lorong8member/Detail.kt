package com.example.lorong8member

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lorong8member.databinding.ActivityDetailBinding

class Detail : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // nerima data dari activity dengan key yang di oper adalah "contoh"
        val detail = intent.getParcelableExtra<DataClass>("contoh")

        // bind item item ke variabel yang akan ditampilkan
        if (detail != null) {
            binding.tvDetail.setImageResource(detail.gambar)
            binding.tvDetailNama.text = "${detail.nama}"
            binding.tvDetailNim.text = "${detail.nim}"
            binding.tvDetailDepartemen.text = "${detail.departemen}"
            binding.tvDetailAsal.text = "${detail.asal}"
            binding.tvDetail2.setImageResource(detail.gambar2)
            binding.tvDetailNama2.text = "${detail.nama2}"
            binding.tvDetailNim2.text = "${detail.nim2}"
            binding.tvDetailDepartemen2.text = "${detail.departemen2}"
            binding.tvDetailAsal2.text = "${detail.asal2}"
            supportActionBar?.title = "${detail.nomorKamar}"
        }
    }
}