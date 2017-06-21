package com.laiforever333.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test("123")
    }

    fun test(str: String?) {
        System.out.println(str?.toCharArray()?.getOrNull(10)?.hashCode())
    }
}
