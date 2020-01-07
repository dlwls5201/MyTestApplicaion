package com.tistory.blackjin.mytestapplicaion

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class GameViewModelTest {

    lateinit var viewModel: GameViewModel

    // Executes each task synchronously using Architecture Components.
    @Rule @JvmField
    var instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        viewModel = GameViewModel()
    }

    @Test
    fun `버튼을 클릭하면, 숫자가 올라갑니다`() {

        viewModel.increaseNumber()
        viewModel.increaseNumber()
        viewModel.increaseNumber()
        viewModel.increaseNumber()
        viewModel.increaseNumber()

        println(LiveDataTestUtil.getValue(viewModel.number))
    }
}