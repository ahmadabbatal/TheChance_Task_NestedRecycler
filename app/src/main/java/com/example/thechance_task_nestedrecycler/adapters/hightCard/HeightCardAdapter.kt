package com.example.thechance_task_nestedrecycler.adapters.hightCard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.LongitudinalCardItemBinding
import com.example.thechance_task_nestedrecycler.linkedList.MyLinkedList
import com.example.thechance_task_nestedrecycler.model.Details
import java.util.*

class HeightCardAdapter(private val details: MyLinkedList<Details>) :
    RecyclerView.Adapter<HeightCardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeightCardViewHolder {
        val binding = LongitudinalCardItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return HeightCardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HeightCardViewHolder, position: Int) {
        val currentItem = details[position]!!
        holder.bind(currentItem)
    }

    override fun getItemCount() = details.size
}