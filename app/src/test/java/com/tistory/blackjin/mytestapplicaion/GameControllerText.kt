package com.tistory.blackjin.mytestapplicaion

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class GameControllerText {

    lateinit var gameController: GameController

    @Before
    fun setUp() {
        gameController = GameController()
    }

    @Test
    fun `contains369`() {
        Assert.assertEquals(true, gameController.contains369(3))
        Assert.assertEquals(true, gameController.contains369(6))
        Assert.assertEquals(true, gameController.contains369(9))
        Assert.assertEquals(false, gameController.contains369(10))
    }
}