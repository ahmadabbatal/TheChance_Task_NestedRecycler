package com.example.thechance_task_nestedrecycler.adapters.categories

import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.CircleCategorieItemBinding
import com.example.thechance_task_nestedrecycler.model.Categories

class CategoryViewHolder(private val binding: CircleCategorieItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(categories: Categories) {
        categories.image.let { binding.imgCategories.setImageResource(it) }
        binding.txtCategoriesTitle.text = categories.title
    }
}