package com.tistory.blackjin.mytestapplicaion

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    private val gameController = GameController()

    val number = MutableLiveData(0)
    val contains = MutableLiveData<Boolean>(false)

    fun increaseNumber() {
        number.value = number.value!!.plus(1)
        contains.value = gameController.contains369(number.value!!)
    }
}