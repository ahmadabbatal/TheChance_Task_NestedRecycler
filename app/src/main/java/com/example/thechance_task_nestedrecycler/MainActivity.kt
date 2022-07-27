package com.example.thechance_task_nestedrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thechance_task_nestedrecycler.adapters.baseAdapter.BaseAdapters
import com.example.thechance_task_nestedrecycler.adapters.offer.OfferAdapter
import com.example.thechance_task_nestedrecycler.databinding.ActivityMainBinding
import com.example.thechance_task_nestedrecycler.db.DataStore
import com.example.thechance_task_nestedrecycler.linkedList.MyLinkedList
import com.example.thechance_task_nestedrecycler.utils.HomeType
import com.example.thechance_task_nestedrecycler.utils.HomeViewType

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var adapter: BaseAdapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            binding.recBaseActivity.layoutManager = LinearLayoutManager(application)
            binding.recBaseActivity.setHasFixedSize(true)

            val itemsList = MyLinkedList<HomeViewType<Any>>()

            itemsList.add(HomeViewType(DataStore.getListImagesForSlider(),HomeType.SLIDER))
            itemsList.add(HomeViewType(DataStore.getListCategories(),HomeType.CATEGORY))
            itemsList.add(HomeViewType(DataStore.getListImagesForOffer(),HomeType.OFFER))
            itemsList.add(HomeViewType(DataStore.getListTitleForYou(),HomeType.TITLE))
            itemsList.add(HomeViewType(DataStore.getListHeightDetails(),HomeType.HEIGHT_CARD))
            itemsList.add(HomeViewType(DataStore.getListTitleMobiles(),HomeType.TITLE))
            itemsList.add(HomeViewType(DataStore.getListSpecificDetails(),HomeType.SPECIFIC_CARD))

            itemsList.add(HomeViewType(DataStore.twoGetListImagesForOffer(),HomeType.OFFER))
            itemsList.add(HomeViewType(DataStore.twoGetListTitleForYou(),HomeType.TITLE))
            itemsList.add(HomeViewType(DataStore.twoGetListHeightDetails(),HomeType.HEIGHT_CARD))
            itemsList.add(HomeViewType(DataStore.twoGetListTitleMobiles(),HomeType.TITLE))
            itemsList.add(HomeViewType(DataStore.twoGetListSpecificDetails(),HomeType.SPECIFIC_CARD))
            itemsList.add(HomeViewType(DataStore.twoGetListCategories(),HomeType.CATEGORY))

            itemsList.add(HomeViewType(DataStore.threeGetListImagesForOffer(),HomeType.OFFER))
            itemsList.add(HomeViewType(DataStore.threeGetListTitleForYou(),HomeType.TITLE))
            itemsList.add(HomeViewType(DataStore.threeGetListHeightDetails(),HomeType.HEIGHT_CARD))
            itemsList.add(HomeViewType(DataStore.threeGetListTitleMobiles(),HomeType.TITLE))
            itemsList.add(HomeViewType(DataStore.threeGetListSpecificDetails(),HomeType.SPECIFIC_CARD))
            itemsList.add(HomeViewType(DataStore.threeGetListCategories(),HomeType.CATEGORY))
            itemsList.add(HomeViewType(DataStore.threeGetListImagesForSlider(),HomeType.SLIDER))

            adapter = BaseAdapters(itemsList)
            recBaseActivity.adapter = adapter

        }


    }
}