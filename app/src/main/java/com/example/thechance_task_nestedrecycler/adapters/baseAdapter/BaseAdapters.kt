package com.example.thechance_task_nestedrecycler.adapters.baseAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.thechance_task_nestedrecycler.R
import com.example.thechance_task_nestedrecycler.adapters.categories.CategoryAdapter
import com.example.thechance_task_nestedrecycler.adapters.detailsCard.DetailsCardAdapter
import com.example.thechance_task_nestedrecycler.adapters.hightCard.HeightCardAdapter
import com.example.thechance_task_nestedrecycler.adapters.offer.OfferAdapter
import com.example.thechance_task_nestedrecycler.adapters.slider.SliderAdapter
import com.example.thechance_task_nestedrecycler.adapters.title.TitleAdapter
import com.example.thechance_task_nestedrecycler.linkedList.MyLinkedList
import com.example.thechance_task_nestedrecycler.model.Categories
import com.example.thechance_task_nestedrecycler.model.Details
import com.example.thechance_task_nestedrecycler.model.Images
import com.example.thechance_task_nestedrecycler.model.Title
import com.example.thechance_task_nestedrecycler.utils.HomeType
import com.example.thechance_task_nestedrecycler.utils.HomeViewType
import java.lang.Exception

class BaseAdapters(private val items: MyLinkedList<HomeViewType<Any>>) :
    RecyclerView.Adapter<BaseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return when (viewType) {
            VIEW_SLIDER -> {
                val view = LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_recycler_slider_item,
                    parent, false
                )
                BaseViewHolder.BaseSliderViewHolder(view)
            }
            VIEW_CATEGORY -> {
                val view = LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_recycler_circle_categorie_item,
                    parent, false
                )
                BaseViewHolder.BaseCategoryViewHolder(view)
            }
            VIEW_OFFER -> {
                val view = LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_recycler_offer_item,
                    parent, false
                )
                BaseViewHolder.BaseOfferViewHolder(view)
            }
            VIEW_TITLE -> {
                val view = LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_recycler_title_item,
                    parent, false
                )
                BaseViewHolder.BaseTitleViewHolder(view)
            }
            VIEW_HEIGHT_CARD -> {
                val view = LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_recycler_longitudinal_item,
                    parent, false
                )
                BaseViewHolder.BaseHeightDetailsViewHolder(view)
            }
            VIEW_SPECIFIC_CARD -> {
                val view = LayoutInflater.from(parent.context).inflate(
                    R.layout.layout_recycler_details_item,
                    parent, false
                )
                BaseViewHolder.BaseSpecificViewHolder(view)
            }
            VIEW_RANDOM_OFFER -> {
                val view = LayoutInflater.from(parent.context).inflate(
                    R.layout.offer_posts_item,
                    parent, false
                )
                BaseViewHolder.BaseRandomViewHolder(view)
            }
            else -> throw Exception("UnKnow View Type")
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        when (holder) {
            is BaseViewHolder.BaseSliderViewHolder -> bindSlider(holder, position)
            is BaseViewHolder.BaseCategoryViewHolder -> bindCategory(holder, position)
            is BaseViewHolder.BaseTitleViewHolder -> bindTitle(holder, position)
            is BaseViewHolder.BaseOfferViewHolder -> bindOffer(holder, position)
            is BaseViewHolder.BaseSpecificViewHolder -> bindDetails(holder, position)
            is BaseViewHolder.BaseHeightDetailsViewHolder -> bindHeightDetails(holder, position)
            is BaseViewHolder.BaseRandomViewHolder -> bindOffer(holder, position)
        }
    }

    private fun bindSlider(holder: BaseViewHolder.BaseSliderViewHolder, position: Int) {
        val slider = items[position]?.item as MyLinkedList<Images>
        val adapter = SliderAdapter(slider)
        holder.binding.apply {
            recSlider.layoutManager = LinearLayoutManager(
                root.context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
            recSlider.adapter = adapter
        }
    }

    private fun bindCategory(holder: BaseViewHolder.BaseCategoryViewHolder, position: Int) {
        val category = items.get(position)?.item as MyLinkedList<Categories>
        val adapter = CategoryAdapter(category)
        holder.binding.apply {
            recCategory.layoutManager = StaggeredGridLayoutManager(
                2,
                StaggeredGridLayoutManager.HORIZONTAL
            )
            recCategory.adapter = adapter
        }
    }

    private fun bindTitle(holder: BaseViewHolder.BaseTitleViewHolder, position: Int) {
        val title = items[position]?.item as MyLinkedList<Title>
        val adapter = TitleAdapter(title)
        holder.binding.apply {
            recTitle.layoutManager = LinearLayoutManager(
                root.context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
            recTitle.adapter = adapter
        }
    }

    private fun bindDetails(holder: BaseViewHolder.BaseSpecificViewHolder, position: Int) {
        val details = items[position]?.item as MyLinkedList<Details>
        val adapter = DetailsCardAdapter(details)
        holder.binding.apply {
            recDetails.layoutManager = LinearLayoutManager(
                root.context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
            recDetails.adapter = adapter
        }
    }

    private fun bindHeightDetails(
        holder: BaseViewHolder.BaseHeightDetailsViewHolder,
        position: Int
    ) {
        val details = items[position]?.item as MyLinkedList<Details>
        val adapter = HeightCardAdapter(details)
        holder.binding.apply {
            recHeightDetails.layoutManager = LinearLayoutManager(
                root.context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
            recHeightDetails.adapter = adapter
        }
    }

    private fun bindOffer(holder: BaseViewHolder.BaseOfferViewHolder, position: Int) {
        val offer = items[position]?.item as MyLinkedList<Images>
        val adapter = OfferAdapter(offer)
        holder.binding.apply {
            recOffer.layoutManager = LinearLayoutManager(
                root.context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
            recOffer.adapter = adapter
        }
    }

    private fun bindOffer(holder: BaseViewHolder.BaseRandomViewHolder, position: Int) {
        val offer = items[position]?.item as Images
        holder.binding.apply {
            offer.image.let { imgRandomOfferImage.setImageResource(it) }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]?.type) {
            HomeType.SLIDER -> VIEW_SLIDER
            HomeType.CATEGORY -> VIEW_CATEGORY
            HomeType.OFFER -> VIEW_OFFER
            HomeType.TITLE -> VIEW_TITLE
            HomeType.HEIGHT_CARD -> VIEW_HEIGHT_CARD
            HomeType.SPECIFIC_CARD -> VIEW_SPECIFIC_CARD
            HomeType.RANDOM_OFFER -> VIEW_RANDOM_OFFER
            else -> throw java.lang.IndexOutOfBoundsException()
        }
    }

    override fun getItemCount() = items.size

    companion object {
        private const val VIEW_SLIDER = 0
        private const val VIEW_CATEGORY = 1
        private const val VIEW_OFFER = 2
        private const val VIEW_TITLE = 3
        private const val VIEW_HEIGHT_CARD = 4
        private const val VIEW_SPECIFIC_CARD = 5
        private const val VIEW_RANDOM_OFFER = 6
    }
}