package com.example.lorong8member

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class Adapter (
    private val data: MutableList<DataClass>, // dataContoh dari MainActivity
    private val listener:(DataClass) -> Unit // untuk ke detail
):RecyclerView.Adapter<Adapter.ViewHolder>() {
    inner class ViewHolder(val v: View): RecyclerView.ViewHolder(v) {
        // bikin inner class view holder, isinya variabel dari item adapter
        val imageProfile = v.findViewById<ImageView>(R.id.tv_rv)
        val namaProfile =v.findViewById<TextView>(R.id.tv_nama_rv)
        val namaProfile2 = v.findViewById<TextView>(R.id.tv_nama2_rv)
    }
    // bikin inner class view holder, isinya variabel dari item adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_adapter, parent, false)
        return ViewHolder(view)
    }
    // ini buat nampilin item adapter dari recycler viewnya
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = data[position]
        holder.imageProfile.setImageResource(list.gambarKamar)
        holder.namaProfile.text = list.nama
        holder.namaProfile2.text = list.nama2
        holder.itemView.findViewById<ConstraintLayout>(R.id.item_adapter_layout).setOnClickListener{
            listener(data[position])
        }
    }
    // buat tau banyaknya data kita
    override fun getItemCount(): Int = data.size


}