package com.tistory.blackjin.mytestapplicaion

class GameController {

    fun contains369(num: Int) = contains(listOf("3", "6", "9"), num)

    private fun contains(list: List<String>, num: Int): Boolean {
        list.forEach {
            val numberString = num.toString()
            if (numberString.contains(it)) {
                return true
            }
        }

        return false
    }
}