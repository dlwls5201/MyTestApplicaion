package com.tistory.blackjin.mytestapplicaion

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class GameViewModelTest {

    lateinit var viewModel: GameViewModel

    // Executes each task synchronously using Architecture Components.
    @Rule
    @JvmField
    var instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        viewModel = GameViewModel()
    }

    @Test
    fun `3번 눌렀을 경우`() {

        viewModel.increaseNumber()
        viewModel.increaseNumber()
        viewModel.increaseNumber()

        Assert.assertEquals(3, LiveDataTestUtil.getValue(viewModel.number))
        Assert.assertEquals(true, LiveDataTestUtil.getValue(viewModel.contains))
    }

    @Test
    fun `5번 눌렀을 경우`() {

        viewModel.increaseNumber()
        viewModel.increaseNumber()
        viewModel.increaseNumber()
        viewModel.increaseNumber()
        viewModel.increaseNumber()

        Assert.assertEquals(5, LiveDataTestUtil.getValue(viewModel.number))
        Assert.assertEquals(false, LiveDataTestUtil.getValue(viewModel.contains))
    }
}