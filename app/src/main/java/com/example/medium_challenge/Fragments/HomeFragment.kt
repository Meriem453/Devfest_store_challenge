package com.example.medium_challenge.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.medium_challenge.Adapters.NewestCollectionAdapter
import com.example.medium_challenge.Adapters.NewestItemsAdapter
import com.example.medium_challenge.Adapters.SpecialOfferAdapter
import com.example.medium_challenge.Data.NewestCollection
import com.example.medium_challenge.Data.NewestItem
import com.example.medium_challenge.Data.Offer
import com.example.medium_challenge.R


class HomeFragment : Fragment() {
 private lateinit var specialOfferAdapter: SpecialOfferAdapter
 private lateinit var newestItemAdapter:NewestItemsAdapter
 private lateinit var newestCollectionAdapter: NewestCollectionAdapter

    private lateinit var special_offers:RecyclerView
    private lateinit var newest_items:RecyclerView
    private lateinit var newest_collect:RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        special_offers = view.findViewById(R.id.specialoffers)
        newest_items = view.findViewById(R.id.newestitems)
        newest_collect = view.findViewById(R.id.newestcollections)


        offersRecyclerView()
        newestRecyclerView()
        collectRecyclerView()



        return view
    }

    private fun collectRecyclerView() {
        specialOfferAdapter = SpecialOfferAdapter(listOf(
            Offer("devfest special tshirt","150","-50%",R.drawable.editable),
            Offer("devfest special sticker","87","-25%",R.drawable.sticker2_1),
            Offer("devfest special tshirt","150","-50%",R.drawable.editable),
        ),requireContext())

        special_offers .adapter = specialOfferAdapter
        special_offers .layoutManager = LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL,false)



    }

    private fun newestRecyclerView() {
        newestItemAdapter = NewestItemsAdapter(listOf(
            NewestItem("Black_Yellow devfest Hoodie","121",R.drawable.hoddie3_1),
            NewestItem("Black_Yellow devfest T-Shirt","57",R.drawable.tshirt),
            NewestItem("Black_Yellow devfest Hoodie","121",R.drawable.hoddie3_1),
        ),requireContext())


        newest_items.adapter=newestItemAdapter
        newest_items.layoutManager= LinearLayoutManager(requireContext(),RecyclerView.HORIZONTAL,false)
    }

    private fun offersRecyclerView() {
        newestCollectionAdapter = NewestCollectionAdapter(listOf(
            NewestCollection("Devfest Blue Collection","Hoddie-T-Shirt-Sticker",R.drawable.recovered),
            NewestCollection("Devfest Yellow Collection","Hoddie-T-Shirt-Sticker",R.drawable.hoddie3_1),
            NewestCollection("Devfest Blue Collection","Hoddie-T-Shirt-Sticker",R.drawable.recovered),
            NewestCollection("Devfest Yellow Collection","Hoddie-T-Shirt-Sticker",R.drawable.hoddie3_1),

            ),requireContext())


        newest_collect.adapter=newestCollectionAdapter
        newest_collect.layoutManager= LinearLayoutManager(requireContext(),RecyclerView.VERTICAL,false)
    }


}