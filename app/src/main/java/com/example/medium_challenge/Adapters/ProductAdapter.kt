package com.example.medium_challenge.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.medium_challenge.Data.Offer
import com.example.medium_challenge.Data.Product
import com.example.medium_challenge.R

class ProductAdapter(private val list: List<Product>, private val c: Context): RecyclerView.Adapter<ProductAdapter.vh> (){


    inner class vh(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text = itemView.findViewById<TextView>(R.id.product_text)
        val price = itemView.findViewById<TextView>(R.id.product_price)
        val quant = itemView.findViewById<TextView>(R.id.product_quant)
        val img = itemView.findViewById<ImageView>(R.id.product_image)
        val buy = itemView.findViewById<LinearLayout>(R.id.product_buy)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vh {
        val view = LayoutInflater.from(c).inflate(R.layout.cart_products,parent,false)
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
            img.setImageResource(list[position].img)
        }
    }
}