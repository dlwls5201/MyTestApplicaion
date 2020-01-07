package com.tistory.blackjin.mytestapplicaion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.tistory.blackjin.mytestapplicaion.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: GameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(GameViewModel::class.java)
        binding.lifecycleOwner = this
        binding.gameViewModel = viewModel
    }

}
