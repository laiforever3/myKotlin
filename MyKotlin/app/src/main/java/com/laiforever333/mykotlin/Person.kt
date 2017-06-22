package com.laiforever333.mykotlin

import android.util.Log

/**
 * Created by Administrator on 2017/6/21.
 */
class Person(var name: String) {
    companion object {
        val TAG: String = "Person"
    }

    var title: String

    constructor(name1: String, name2: String) : this(name1) {
        Log.e(TAG, "constructor  name1=$name1    name2=$name2")
        name = name2
        title = name2
    }

    init {
        Log.e(TAG, "init")
        title = "123"
    }


}