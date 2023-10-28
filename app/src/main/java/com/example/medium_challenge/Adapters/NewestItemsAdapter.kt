package com.example.medium_challenge.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.medium_challenge.Data.NewestItem
import com.example.medium_challenge.Data.Offer
import com.example.medium_challenge.R

class NewestItemsAdapter (private val list: List<NewestItem>, private val c: Context): RecyclerView.Adapter<NewestItemsAdapter.vh> (){


    inner class vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text = itemView.findViewById<TextView>(R.id.newest_text)
        val price = itemView.findViewById<TextView>(R.id.newest_price)
        val img = itemView.findViewById<ImageView>(R.id.newest_img)
        val add = itemView.findViewById<LinearLayout>(R.id.newest_add)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vh {
        val view = LayoutInflater.from(c).inflate(R.layout.newest_item,parent,false)
        return vh(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: vh, position: Int) {
        holder.apply {
            text.text = list[position].text
            price.text=list[position].price
            img.setImageResource(list[position].img)
        }
    }
}