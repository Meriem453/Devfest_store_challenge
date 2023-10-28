package com.example.medium_challenge.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.medium_challenge.Adapters.ChackPointAdapter
import com.example.medium_challenge.Adapters.ProductAdapter
import com.example.medium_challenge.Data.CheckPoint
import com.example.medium_challenge.Data.Product
import com.example.medium_challenge.R

class CartFragment : Fragment() {
  private lateinit var check:RecyclerView
  private lateinit var products :RecyclerView

  private lateinit var check_adapter: ChackPointAdapter
  private lateinit var product_adapter: ProductAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cart, container, false)

        check = view.findViewById(R.id.checkpoint)
        products = view.findViewById(R.id.products)

        checkRecyclerView()
        productsRecyclerView()

        return view
    }

    private fun productsRecyclerView() {
        product_adapter = ProductAdapter(listOf(
            Product("Devfest Blue Hoodie","01","150",R.drawable.recovered),
            Product("Black-Yellow Devfest T-Shirt","02","140",R.drawable.tshirt),
            Product("Devfest Blue Hoodie","1","150",R.drawable.recovered),
            Product("Black-Yellow Devfest T-Shirt","02","140",R.drawable.tshirt),
        ),requireContext())

        products.adapter = product_adapter
        products.layoutManager=LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false)
    }

    private fun checkRecyclerView() {
        check_adapter = ChackPointAdapter(listOf(
           CheckPoint("Devfest Blue Hoodie","01","150"),
            CheckPoint("Black-Yellow Devfest T-Shirt","02","140"),
            CheckPoint("Devfest Blue Hoodie","01","150"),
            CheckPoint("Black-Yellow Devfest T-Shirt","02","140"),
        ),requireContext())

       check.adapter = check_adapter
        check.layoutManager=LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false)
    }


}