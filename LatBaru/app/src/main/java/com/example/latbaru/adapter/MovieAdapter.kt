package com.example.latbaru.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.latbaru.DetailMovie
import com.example.latbaru.MovieActivity
import com.example.latbaru.R
import com.example.latbaru.model.ModelMovie

class MovieAdapter constructor(
    private val getActivity: MovieActivity,
    private val movieList: List<ModelMovie>


) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val txtMovie = itemView.findViewById<TextView>(R.id.txtMovie)
        val imageMovie = itemView.findViewById<ImageView>(R.id.imageView2)
        val cardMovie = itemView.findViewById<CardView>(R.id.cardMovie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.itemmoviecard, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
         return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imageMovie.setImageResource(movieList[position].image)
        holder.cardMovie.setOnClickListener {
            val modelMovie = movieList[position]
            val title = modelMovie.title
            val image = modelMovie.image
        }

//        agar bisa di klik
        holder.cardMovie.setOnClickListener {
            val modelMovie = movieList[position]
            val title = modelMovie.title
            val image = modelMovie.image
            val intent = Intent(getActivity, DetailMovie::class.java)
            intent.putExtra("judul", title)
            intent.putExtra("image", image)
            getActivity.startActivity(intent)


        }
    }
}