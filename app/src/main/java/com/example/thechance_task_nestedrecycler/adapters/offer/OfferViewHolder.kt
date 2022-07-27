package com.example.thechance_task_nestedrecycler.adapters.offer

import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.ItemsOfferItemBinding
import com.example.thechance_task_nestedrecycler.model.Images

class OfferViewHolder (private val binding: ItemsOfferItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(image: Images) {
        image.image.let { binding.imgOffer.setImageResource(it) }
    }
}