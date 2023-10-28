package com.example.medium_challenge.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.medium_challenge.Data.Offer
import com.example.medium_challenge.R

class SpecialOfferAdapter(private val list: List<Offer>, private val c:Context):RecyclerView.Adapter<SpecialOfferAdapter.vh> (){


    inner class vh(itemView: View) : ViewHolder(itemView) {
        val text = itemView.findViewById<TextView>(R.id.itemoffer_text)
        val price = itemView.findViewById<TextView>(R.id.itemoffer_price)
        val sold = itemView.findViewById<TextView>(R.id.itemoffer_sold)
        val img = itemView.findViewById<ImageView>(R.id.itemoffer_image)
        val buy = itemView.findViewById<LinearLayout>(R.id.itemoffer_buy)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vh {
        val view = LayoutInflater.from(c).inflate(R.layout.offer_item,parent,false)
        return vh(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: vh, position: Int) {
        holder.apply {
            text.text = list[position].text
            price.text=list[position].price
            sold.text=list[position].sold
            img.setImageResource(list[position].img)
        }
    }
}