package com.tistory.blackjin.mytestapplicaion

import com.tistory.blackjin.mytestapplicaion.main.MainContract
import com.tistory.blackjin.mytestapplicaion.main.MainPresenter
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InOrder
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainPresenterTest {

    private lateinit var mainPresenter: MainPresenter

    private lateinit var inOrder: InOrder

    @Mock
    private lateinit var view: MainContract.View

    @Before
    fun setUp() {
        mainPresenter = MainPresenter(view)
        inOrder = Mockito.inOrder(view)
    }

    @Test
    fun `플러스 버튼 2번 클릭`() {
        mainPresenter.plusNumber()
        mainPresenter.plusNumber()

        inOrder.verify(view).showNumber("1")
        inOrder.verify(view).hideClap()

        inOrder.verify(view).showNumber("2")
        inOrder.verify(view).hideClap()
    }

    @Test
    fun `플러스 버튼 3번 클릭`() {
        mainPresenter.plusNumber()
        mainPresenter.plusNumber()
        mainPresenter.plusNumber()

        inOrder.verify(view).showNumber("1")
        inOrder.verify(view).hideClap()

        inOrder.verify(view).showNumber("2")
        inOrder.verify(view).hideClap()

        inOrder.verify(view).showNumber("3")
        inOrder.verify(view).showClap()
    }
}