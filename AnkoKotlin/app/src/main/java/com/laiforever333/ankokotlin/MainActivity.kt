package com.laiforever333.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.laiforever333.ankokotlin.R
import com.laiforever333.mykotlin.data.Forecast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val f1 = Forecast(Date(), 2.1f, "ccc")
        f1.temperature = 22.1f
       // val f2 = f1.copy(details = "abc")
        val (date, temperature, details) = f1
        Log.e("TAG", "f1=" + f1)
       // Log.e("TAG", "f2=" + f2)
    }

    fun test(str: String?) {
        System.out.println(str?.toCharArray()?.getOrNull(10)?.hashCode())
    }
}
