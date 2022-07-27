package com.example.thechance_task_nestedrecycler.adapters.hightCard

import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.LongitudinalCardItemBinding
import com.example.thechance_task_nestedrecycler.model.Details

class HeightCardViewHolder(private val binding: LongitudinalCardItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(details: Details) {
        details.image.let { binding.imgLongCardItem.setImageResource(it) }
        binding.txtLongCardDescriptionItem.text = details.dec
        binding.txtLongCardPriceItem.text = details.price
        binding.txtLongCardOfferItem.text = details.offers
    }
}