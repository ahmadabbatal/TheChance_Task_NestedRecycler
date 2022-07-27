package com.example.thechance_task_nestedrecycler.adapters.categories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.CircleCategorieItemBinding
import com.example.thechance_task_nestedrecycler.linkedList.MyLinkedList
import com.example.thechance_task_nestedrecycler.model.Categories
import java.util.*

class CategoryAdapter(private val category: MyLinkedList<Categories>) :
    RecyclerView.Adapter<CategoryViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = CircleCategorieItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val currentItem = category[position]!!
        holder.bind(currentItem)
    }

    override fun getItemCount() = category.size
}