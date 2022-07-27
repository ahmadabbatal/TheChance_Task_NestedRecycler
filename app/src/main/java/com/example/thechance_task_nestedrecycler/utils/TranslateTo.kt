package com.example.thechance_task_nestedrecycler.utils

import com.example.thechance_task_nestedrecycler.model.Images

fun Images.translateTo(): HomeViewType<Any>{
    return HomeViewType(this,HomeType.RANDOM_OFFER)
}