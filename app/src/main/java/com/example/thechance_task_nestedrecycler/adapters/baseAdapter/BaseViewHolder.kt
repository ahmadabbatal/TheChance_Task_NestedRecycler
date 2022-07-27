package com.example.thechance_task_nestedrecycler.adapters.baseAdapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.thechance_task_nestedrecycler.databinding.*

sealed class BaseViewHolder(_binding: View):RecyclerView.ViewHolder(_binding) {

    class BaseSliderViewHolder(private val v:View) : BaseViewHolder(v)
    { val binding = LayoutRecyclerSliderItemBinding.bind(v) }

    class BaseCategoryViewHolder(private val v:View) : BaseViewHolder(v)
    { val binding = LayoutRecyclerCircleCategorieItemBinding.bind(v) }

    class BaseHeightDetailsViewHolder(private val v:View) : BaseViewHolder(v)
    { val binding = LayoutRecyclerLongitudinalItemBinding.bind(v) }

    class BaseOfferViewHolder(private val v:View) : BaseViewHolder(v)
    { val binding = LayoutRecyclerOfferItemBinding.bind(v) }

    class BaseSpecificViewHolder(private val v:View) : BaseViewHolder(v)
    { val binding = LayoutRecyclerDetailsItemBinding.bind(v) }

    class BaseTitleViewHolder(private val v:View) : BaseViewHolder(v)
    { val binding = LayoutRecyclerTitleItemBinding.bind(v) }

}