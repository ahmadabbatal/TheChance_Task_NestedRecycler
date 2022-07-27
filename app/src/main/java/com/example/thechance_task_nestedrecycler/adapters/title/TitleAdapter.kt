package com.example.thechance_task_nestedrecycler.adapters.title

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.TitleItemBinding
import com.example.thechance_task_nestedrecycler.linkedList.MyLinkedList
import com.example.thechance_task_nestedrecycler.model.Title
import java.util.*

class TitleAdapter(private val title: MyLinkedList<Title>) :
    RecyclerView.Adapter<TitleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitleViewHolder {
        val binding = TitleItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return TitleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TitleViewHolder, position: Int) {
        val currentItem = title[position]!!
        holder.bind(currentItem)
    }

    override fun getItemCount() = title.size
}