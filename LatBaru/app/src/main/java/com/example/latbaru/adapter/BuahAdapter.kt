package com.example.latbaru.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.latbaru.R
import com.example.latbaru.model.ModelBuah

class BuahAdapter(val itemList: ArrayList<ModelBuah>) : RecyclerView.Adapter<BuahAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Deklarasi widget dari item layout
        val itemImage: ImageView = itemView.findViewById(R.id.gambar)
        val itemText: TextView = itemView.findViewById(R.id.nama)
    }

    override fun onCreateViewHolder(parent:ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context).inflate(R.layout.costumbuah, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {  // Gunakan MyViewHolder
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.text = itemList[position].judul
    }
}