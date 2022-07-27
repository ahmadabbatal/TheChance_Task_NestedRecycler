package com.example.thechance_task_nestedrecycler.adapters.detailsCard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.SpecificListItemBinding
import com.example.thechance_task_nestedrecycler.linkedList.MyLinkedList
import com.example.thechance_task_nestedrecycler.model.Details
import java.util.*

class DetailsCardAdapter(private val details:MyLinkedList<Details>) :
    RecyclerView.Adapter<DetailsCardViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsCardViewHolder {
        val binding = SpecificListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return DetailsCardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DetailsCardViewHolder, position: Int) {
        val currentItem = details[position]!!
        holder.bind(currentItem)
    }

    override fun getItemCount() = details.size
}