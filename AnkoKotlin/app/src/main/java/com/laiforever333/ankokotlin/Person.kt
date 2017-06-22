package com.laiforever333.mykotlin

/**
 * Created by Administrator on 2017/6/21.
 */
class Person(var name: String, var age: Int) {
    init {
        name = "lai"
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}