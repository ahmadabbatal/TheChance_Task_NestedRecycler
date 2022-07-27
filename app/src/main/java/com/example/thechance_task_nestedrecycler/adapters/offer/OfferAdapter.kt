package com.example.thechance_task_nestedrecycler.adapters.offer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.ItemsOfferItemBinding
import com.example.thechance_task_nestedrecycler.linkedList.MyLinkedList
import com.example.thechance_task_nestedrecycler.model.Images
import java.util.*

class OfferAdapter(private val offer: MyLinkedList<Images>) :
    RecyclerView.Adapter<OfferViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        val binding = ItemsOfferItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OfferViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        val currentItem = offer[position]!!
        holder.bind(currentItem)
    }

    override fun getItemCount() = offer.size
}