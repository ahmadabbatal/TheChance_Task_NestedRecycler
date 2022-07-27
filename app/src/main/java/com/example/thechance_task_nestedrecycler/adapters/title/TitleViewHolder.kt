package com.example.thechance_task_nestedrecycler.adapters.title

import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.TitleItemBinding
import com.example.thechance_task_nestedrecycler.model.Title

class TitleViewHolder(private val binding: TitleItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(title: Title) {
        binding.txtTitle.text = title.titleName
    }
}