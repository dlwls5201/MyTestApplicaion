package com.tistory.blackjin.mytestapplicaion.main

import com.tistory.blackjin.mytestapplicaion.GameController

class MainPresenter(
    private val view: MainContract.View
) : MainContract.Presenter {

    private var number = 0

    override fun plusNumber() {
        number++
        view.showNumber(number.toString())

        check369(number)
    }

    private val gameContract = GameController()

    private fun check369(num: Int) {
        if (gameContract.contains369(num)) {
            view.showClap()
        } else {
            view.hideClap()
        }
    }
}