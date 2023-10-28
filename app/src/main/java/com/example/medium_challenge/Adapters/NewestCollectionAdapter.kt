package com.example.medium_challenge.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.medium_challenge.Data.NewestCollection
import com.example.medium_challenge.Data.NewestItem
import com.example.medium_challenge.R

class NewestCollectionAdapter (private val list: List<NewestCollection>, private val c: Context): RecyclerView.Adapter<NewestCollectionAdapter.vh> (){


    inner class vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text = itemView.findViewById<TextView>(R.id.collect_text)
        val img = itemView.findViewById<ImageView>(R.id.collect_image)
        val buy = itemView.findViewById<LinearLayout>(R.id.collect_buy)
        val items =itemView.findViewById<TextView>(R.id.collect_items)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vh {
        val view = LayoutInflater.from(c).inflate(R.layout.newest_collection,parent,false)
        return vh(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: vh, position: Int) {
        holder.apply {
            text.text = list[position].text
            items.text = list[position].items
            img.setImageResource(list[position].img)
        }
    }
}