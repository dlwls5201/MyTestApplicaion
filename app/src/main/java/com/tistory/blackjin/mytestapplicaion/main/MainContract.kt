package com.tistory.blackjin.mytestapplicaion.main

import com.tistory.blackjin.mytestapplicaion.base.BaseView

interface MainContract {

    interface View : BaseView<Presenter> {

        fun showNumber(num: String)

        fun showClap()

        fun hideClap()
    }

    interface Presenter {

        fun plusNumber()
    }
}