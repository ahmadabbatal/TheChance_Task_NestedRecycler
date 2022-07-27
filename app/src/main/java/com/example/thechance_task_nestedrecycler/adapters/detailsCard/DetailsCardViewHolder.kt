package com.example.thechance_task_nestedrecycler.adapters.detailsCard

import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.SpecificListItemBinding
import com.example.thechance_task_nestedrecycler.model.Details

class DetailsCardViewHolder(private val binding: SpecificListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(details: Details) {
        details.image.let { binding.imgDetailsCardItem.setImageResource(it) }
        binding.txtLongCardDescriptionItem.text = details.dec
        binding.txtLongCardPriceItem.text = details.price
        binding.txtLongCardOfferItem.text = details.offers
    }
}