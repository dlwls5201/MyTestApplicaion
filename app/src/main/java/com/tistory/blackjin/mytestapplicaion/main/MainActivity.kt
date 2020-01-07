package com.tistory.blackjin.mytestapplicaion.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tistory.blackjin.mytestapplicaion.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    override lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(
            this
        )

        button.setOnClickListener {
            presenter.plusNumber()
        }
    }

    override fun showNumber(num: String) {
        tvNumber.text = num
    }

    override fun showClap() {
        tvClap.text = resources.getString(R.string.clap_text)
    }

    override fun hideClap() {
        tvClap.text = ""
    }
}
