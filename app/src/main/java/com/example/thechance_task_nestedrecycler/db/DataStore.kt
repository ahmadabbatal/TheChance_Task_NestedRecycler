package com.example.thechance_task_nestedrecycler.db

import com.example.thechance_task_nestedrecycler.R
import com.example.thechance_task_nestedrecycler.linkedList.MyLinkedList
import com.example.thechance_task_nestedrecycler.model.Categories
import com.example.thechance_task_nestedrecycler.model.Details
import com.example.thechance_task_nestedrecycler.model.Images
import com.example.thechance_task_nestedrecycler.model.Title

object DataStore {

    // 1
    private val listImagesForSlider = MyLinkedList<Images>()
    private val listImagesForOffer = MyLinkedList<Images>()
    private val listCategories = MyLinkedList<Categories>()
    private val listTitleForYou = MyLinkedList<Title>()
    private val listTitleMobiles = MyLinkedList<Title>()
    private val listSpecificDetails = MyLinkedList<Details>()
    private val listHeightDetails = MyLinkedList<Details>()

    fun getListImagesForSlider(): MyLinkedList<Images>{
        listImagesForSlider.add(Images(1, R.drawable.slid_two))
        listImagesForSlider.add(Images(2, R.drawable.slide_three))
        listImagesForSlider.add(Images(3, R.drawable.slide_zero))
        return listImagesForSlider
    }

    fun getListImagesForOffer(): MyLinkedList<Images>{
        listImagesForOffer.add(Images(1, R.drawable.offer_first))
        listImagesForOffer.add(Images(2, R.drawable.second_offer))
        listImagesForOffer.add(Images(3, R.drawable.second_offer))
        listImagesForOffer.add(Images(4, R.drawable.forth_offer))
        return listImagesForOffer
    }

    fun getListCategories(): MyLinkedList<Categories>{
        listCategories.add(Categories(1, R.drawable.char_gaming,"Gaming"))
        listCategories.add(Categories(2, R.drawable.categories_lab,"Laptops"))
        listCategories.add(Categories(3, R.drawable.pc_categories,"PCs"))
        listCategories.add(Categories(4, R.drawable.tv_categories,"TVs"))
        listCategories.add(Categories(5, R.drawable.beauty_categories,"Beauty"))
        listCategories.add(Categories(6, R.drawable.shose_categories,"Shoes"))
        listCategories.add(Categories(7, R.drawable.one_category,"Mobiles"))
        listCategories.add(Categories(8, R.drawable.perfume_categories,"Perfume"))
        listCategories.add(Categories(9, R.drawable.stationery_categories,"Stationery"))
        listCategories.add(Categories(10, R.drawable.furniture_categories,"Furniture"))
        return listCategories
    }

    fun getListTitleForYou(): MyLinkedList<Title>{
        listTitleForYou.add(Title(1, "For You"))
        return listTitleForYou
    }

    fun getListTitleMobiles(): MyLinkedList<Title>{
        listTitleMobiles.add(Title(1, "Mobiles"))
        return listTitleMobiles
    }

    fun getListSpecificDetails(): MyLinkedList<Details>{

        listHeightDetails.add(Details(
            1,
            R.drawable.mouse_details_removebg_preview,
            "Razer Death Adder Essential Gaming Mouse",
            "$ 18.65",
            " / 14%"
        ))

        listHeightDetails.add(Details(
            2,
            R.drawable.fold_samsong_details_removebg_preview,
            "SAMSUNG Galaxy Z Fold 3 5G Cell Phone, Factory Unlocked 2-in-1 ",
            "$ 1100",
            " / 5%"
        ))

        listHeightDetails.add(Details(
            3,
            R.drawable.head_phone_two_removebg_preview,
            "Razer Kraken Ultimate RGB USB Gaming Headset",
            "$ 220",
            " / 10%"
        ))

        listHeightDetails.add(Details(
            4,
            R.drawable.watch_gld_details_removebg_preview,
            "Vilsaw Smart Watch, Fitness Smartwatch with Heart Rate Monitor ",
            "$ 230",
            " / 16%"
        ))

        listHeightDetails.add(Details(
            5,
            R.drawable.toutch_watch_preview,
            "Amazfit T-Rex Pro Smart Watch for Men Rugged Outdoor GPS Fitness Watch",
            "$ 140",
            " / 13%"
        ))

        return listHeightDetails
    }

    fun getListHeightDetails(): MyLinkedList<Details>{
        listSpecificDetails.add(Details(
            1,
            R.drawable.tecno_fif_g_removebg_preview,
            "Tecno Pova best cheap phone for gaming",
            "$ 170",
            " / 4%"
        ))

        listSpecificDetails.add(Details(
            2,
            R.drawable.fold_samsong_details_removebg_preview,
            "SAMSUNG Galaxy Z Fold 3 5G Cell Phone, Factory Unlocked 2-in-1 ",
            "$ 1100",
            " / 5%"
        ))

        listSpecificDetails.add(Details(
            3,
            R.drawable.one_plus_detailc_removebg_preview,
            "OnePlus Nord N20 5G |Android Smart Phone",
            "$ 600",
            " / 6%"
        ))

        listSpecificDetails.add(Details(
            4,
            R.drawable.pixel_fore_removebg_preview,
            "Google Pixel 6 Pro - 5G Android Phone - Unlocked",
            "$ 340",
            " / 12%"
        ))

        listSpecificDetails.add(Details(
            5,
            R.drawable.samsong_details_ss_removebg_preview,
            "SAMSUNG Galaxy S22 Cell Phone, Factory Unlocked Android Smartphone, 128GB",
            "$ 890",
            " / 11%"
        ))
        return listSpecificDetails
    }

    /*_______________________________________________________________________*/

    // 2
    private val twoListImagesForSlider = MyLinkedList<Images>()
    private val twoListImagesForOffer = MyLinkedList<Images>()
    private val twoListCategories = MyLinkedList<Categories>()
    private val twoListTitleForYou = MyLinkedList<Title>()
    private val twoListTitleMobiles = MyLinkedList<Title>()
    private val twoListSpecificDetails = MyLinkedList<Details>()
    private val twoListHeightDetails = MyLinkedList<Details>()

    fun twoGetListImagesForSlider(): MyLinkedList<Images>{
        twoListImagesForSlider.add(Images(1, R.drawable.slid_two))
        twoListImagesForSlider.add(Images(2, R.drawable.slide_three))
        twoListImagesForSlider.add(Images(3, R.drawable.slide_zero))
        return twoListImagesForSlider
    }

    fun twoGetListImagesForOffer(): MyLinkedList<Images>{
        twoListImagesForOffer.add(Images(1, R.drawable.offer_first))
        twoListImagesForOffer.add(Images(2, R.drawable.second_offer))
        twoListImagesForOffer.add(Images(3, R.drawable.second_offer))
        twoListImagesForOffer.add(Images(4, R.drawable.forth_offer))
        return twoListImagesForOffer
    }

    fun twoGetListCategories(): MyLinkedList<Categories>{
        twoListCategories.add(Categories(1, R.drawable.char_gaming,"Gaming"))
        twoListCategories.add(Categories(2, R.drawable.categories_lab,"Laptops"))
        twoListCategories.add(Categories(3, R.drawable.pc_categories,"PCs"))
        twoListCategories.add(Categories(4, R.drawable.tv_categories,"TVs"))
        twoListCategories.add(Categories(5, R.drawable.beauty_categories,"Beauty"))
        twoListCategories.add(Categories(6, R.drawable.shose_categories,"Shoes"))
        twoListCategories.add(Categories(7, R.drawable.one_category,"Mobiles"))
        twoListCategories.add(Categories(8, R.drawable.perfume_categories,"Perfume"))
        twoListCategories.add(Categories(9, R.drawable.stationery_categories,"Stationery"))
        twoListCategories.add(Categories(10, R.drawable.furniture_categories,"Furniture"))
        return twoListCategories
    }

    fun twoGetListTitleForYou(): MyLinkedList<Title>{
        twoListTitleForYou.add(Title(1, "For You"))
        return twoListTitleForYou
    }

    fun twoGetListTitleMobiles(): MyLinkedList<Title>{
        twoListTitleMobiles.add(Title(1, "Mobiles"))
        return twoListTitleMobiles
    }

    fun twoGetListSpecificDetails(): MyLinkedList<Details>{

        twoListSpecificDetails.add(Details(
            1,
            R.drawable.mouse_details_removebg_preview,
            "Razer Death Adder Essential Gaming Mouse",
            "$ 18.65",
            " / 14%"
        ))

        twoListSpecificDetails.add(Details(
            2,
            R.drawable.fold_samsong_details_removebg_preview,
            "SAMSUNG Galaxy Z Fold 3 5G Cell Phone, Factory Unlocked 2-in-1 ",
            "$ 1100",
            " / 5%"
        ))

        twoListSpecificDetails.add(Details(
            3,
            R.drawable.head_phone_two_removebg_preview,
            "Razer Kraken Ultimate RGB USB Gaming Headset",
            "$ 220",
            " / 10%"
        ))

        twoListSpecificDetails.add(Details(
            4,
            R.drawable.watch_gld_details_removebg_preview,
            "Vilsaw Smart Watch, Fitness Smartwatch with Heart Rate Monitor ",
            "$ 230",
            " / 16%"
        ))

        twoListSpecificDetails.add(Details(
            5,
            R.drawable.toutch_watch_preview,
            "Amazfit T-Rex Pro Smart Watch for Men Rugged Outdoor GPS Fitness Watch",
            "$ 140",
            " / 13%"
        ))

        return twoListSpecificDetails
    }

    fun twoGetListHeightDetails(): MyLinkedList<Details>{
        twoListHeightDetails.add(Details(
            1,
            R.drawable.tecno_fif_g_removebg_preview,
            "Tecno Pova best cheap phone for gaming",
            "$ 170",
            " / 4%"
        ))

        twoListHeightDetails.add(Details(
            2,
            R.drawable.fold_samsong_details_removebg_preview,
            "SAMSUNG Galaxy Z Fold 3 5G Cell Phone, Factory Unlocked 2-in-1 ",
            "$ 1100",
            " / 5%"
        ))

        twoListHeightDetails.add(Details(
            3,
            R.drawable.one_plus_detailc_removebg_preview,
            "OnePlus Nord N20 5G |Android Smart Phone",
            "$ 600",
            " / 6%"
        ))

        twoListHeightDetails.add(Details(
            4,
            R.drawable.pixel_fore_removebg_preview,
            "Google Pixel 6 Pro - 5G Android Phone - Unlocked",
            "$ 340",
            " / 12%"
        ))

        twoListHeightDetails.add(Details(
            5,
            R.drawable.samsong_details_ss_removebg_preview,
            "SAMSUNG Galaxy S22 Cell Phone, Factory Unlocked Android Smartphone, 128GB",
            "$ 890",
            " / 11%"
        ))
        return twoListHeightDetails
    }


    /*_______________________________________________________________________*/

    // 3
    private val threeListImagesForSlider = MyLinkedList<Images>()
    private val threeListImagesForOffer = MyLinkedList<Images>()
    private val threeListCategories = MyLinkedList<Categories>()
    private val threeListTitleForYou = MyLinkedList<Title>()
    private val threeListTitleMobiles = MyLinkedList<Title>()
    private val threeListSpecificDetails = MyLinkedList<Details>()
    private val threeListHeightDetails = MyLinkedList<Details>()

    fun threeGetListImagesForSlider(): MyLinkedList<Images>{
        twoListImagesForSlider.add(Images(1, R.drawable.slid_two))
        twoListImagesForSlider.add(Images(2, R.drawable.slide_three))
        twoListImagesForSlider.add(Images(3, R.drawable.slide_zero))
        return twoListImagesForSlider
    }

    fun threeGetListImagesForOffer(): MyLinkedList<Images>{
        twoListImagesForOffer.add(Images(1, R.drawable.offer_first))
        twoListImagesForOffer.add(Images(2, R.drawable.second_offer))
        twoListImagesForOffer.add(Images(3, R.drawable.second_offer))
        twoListImagesForOffer.add(Images(4, R.drawable.forth_offer))
        return twoListImagesForOffer
    }

    fun threeGetListCategories(): MyLinkedList<Categories>{
        twoListCategories.add(Categories(1, R.drawable.char_gaming,"Gaming"))
        twoListCategories.add(Categories(2, R.drawable.categories_lab,"Laptops"))
        twoListCategories.add(Categories(3, R.drawable.pc_categories,"PCs"))
        twoListCategories.add(Categories(4, R.drawable.tv_categories,"TVs"))
        twoListCategories.add(Categories(5, R.drawable.beauty_categories,"Beauty"))
        twoListCategories.add(Categories(6, R.drawable.shose_categories,"Shoes"))
        twoListCategories.add(Categories(7, R.drawable.one_category,"Mobiles"))
        twoListCategories.add(Categories(8, R.drawable.perfume_categories,"Perfume"))
        twoListCategories.add(Categories(9, R.drawable.stationery_categories,"Stationery"))
        twoListCategories.add(Categories(10, R.drawable.furniture_categories,"Furniture"))
        return twoListCategories
    }

    fun threeGetListTitleForYou(): MyLinkedList<Title>{
        twoListTitleForYou.add(Title(1, "For You"))
        return twoListTitleForYou
    }

    fun threeGetListTitleMobiles(): MyLinkedList<Title>{
        twoListTitleMobiles.add(Title(1, "Mobiles"))
        return twoListTitleMobiles
    }

    fun threeGetListSpecificDetails(): MyLinkedList<Details>{

        twoListSpecificDetails.add(Details(
            1,
            R.drawable.mouse_details_removebg_preview,
            "Razer Death Adder Essential Gaming Mouse",
            "$ 18.65",
            " / 14%"
        ))

        twoListSpecificDetails.add(Details(
            2,
            R.drawable.fold_samsong_details_removebg_preview,
            "SAMSUNG Galaxy Z Fold 3 5G Cell Phone, Factory Unlocked 2-in-1 ",
            "$ 1100",
            " / 5%"
        ))

        twoListSpecificDetails.add(Details(
            3,
            R.drawable.head_phone_two_removebg_preview,
            "Razer Kraken Ultimate RGB USB Gaming Headset",
            "$ 220",
            " / 10%"
        ))

        twoListSpecificDetails.add(Details(
            4,
            R.drawable.watch_gld_details_removebg_preview,
            "Vilsaw Smart Watch, Fitness Smartwatch with Heart Rate Monitor ",
            "$ 230",
            " / 16%"
        ))

        twoListSpecificDetails.add(Details(
            5,
            R.drawable.toutch_watch_preview,
            "Amazfit T-Rex Pro Smart Watch for Men Rugged Outdoor GPS Fitness Watch",
            "$ 140",
            " / 13%"
        ))

        return twoListSpecificDetails
    }

    fun threeGetListHeightDetails(): MyLinkedList<Details>{
        twoListHeightDetails.add(Details(
            1,
            R.drawable.tecno_fif_g_removebg_preview,
            "Tecno Pova best cheap phone for gaming",
            "$ 170",
            " / 4%"
        ))

        twoListHeightDetails.add(Details(
            2,
            R.drawable.fold_samsong_details_removebg_preview,
            "SAMSUNG Galaxy Z Fold 3 5G Cell Phone, Factory Unlocked 2-in-1 ",
            "$ 1100",
            " / 5%"
        ))

        twoListHeightDetails.add(Details(
            3,
            R.drawable.one_plus_detailc_removebg_preview,
            "OnePlus Nord N20 5G |Android Smart Phone",
            "$ 600",
            " / 6%"
        ))

        twoListHeightDetails.add(Details(
            4,
            R.drawable.pixel_fore_removebg_preview,
            "Google Pixel 6 Pro - 5G Android Phone - Unlocked",
            "$ 340",
            " / 12%"
        ))

        twoListHeightDetails.add(Details(
            5,
            R.drawable.samsong_details_ss_removebg_preview,
            "SAMSUNG Galaxy S22 Cell Phone, Factory Unlocked Android Smartphone, 128GB",
            "$ 890",
            " / 11%"
        ))
        return twoListHeightDetails
    }


}