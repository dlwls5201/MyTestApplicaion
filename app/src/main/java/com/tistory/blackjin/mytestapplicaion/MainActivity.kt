package com.tistory.blackjin.mytestapplicaion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var number = 0

    private val gameController = GameController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            number++
            tvNumber.text = "$number"

            if (gameController.contains369(number)) {
                tvClap.text = resources.getString(R.string.clap_text)
            } else {
                tvClap.text = ""
            }
        }
    }
}
