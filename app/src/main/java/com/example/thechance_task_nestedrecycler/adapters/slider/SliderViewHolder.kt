package com.example.thechance_task_nestedrecycler.adapters.slider

import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.SliderItemBinding
import com.example.thechance_task_nestedrecycler.model.Images

class SliderViewHolder(private val binding: SliderItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(image: Images) {
        image.image.let { binding.imgSlide.setImageResource(it) }
    }
}