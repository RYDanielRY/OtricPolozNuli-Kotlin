package com.company

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val i = Scanner(System.`in`)
        var numStr: List<String> = ArrayList()
        val str = i.nextLine()
        numStr = Arrays.asList(*str.split(" ".toRegex()).toTypedArray())
        val num: MutableList<Int> = ArrayList()
        for (j in numStr.indices) {
            num.add(numStr[j].toInt())
        }
        Collections.sort(num)
        for (j in 0 until num.size - 1) {
            print(num[j].toString() + ", ")
        }
        println(num[num.size - 1])
    }
}