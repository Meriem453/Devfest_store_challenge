package com.example.medium_challenge.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.medium_challenge.Data.CheckPoint
import com.example.medium_challenge.Data.Offer
import com.example.medium_challenge.R

class ChackPointAdapter (private val list: List<CheckPoint>, private val c: Context): RecyclerView.Adapter<ChackPointAdapter.vh> (){


    inner class vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text = itemView.findViewById<TextView>(R.id.check_text)
        val price = itemView.findViewById<TextView>(R.id.check_price)
        val quant = itemView.findViewById<TextView>(R.id.check_quant)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vh {
        val view = LayoutInflater.from(c).inflate(R.layout.checkpoints,parent,false)
        return vh(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: vh, position: Int) {
        holder.apply {
            text.text = list[position].text
            price.text=list[position].price
            quant.text=list[position].quant
        }
    }
}