package com.laiforever333.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.laiforever333.mykotlin.ForecastRequest.Companion.COMPLETE_URL
import com.laiforever333.mykotlin.data.Forecast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        COMPLETE_URL
        val f1 = Forecast(Date(), 2.1f, "ccc")
        f1.temperature = 22.1f
        Log.e("TAG", "f1=" + f1)

       // Person("1111")
       // Person("12222", "33333")
       // DontCreateMe("2级构造函数")
        C().f()
    }

    fun test(str: String?) {
        System.out.println(str?.toCharArray()?.getOrNull(10)?.hashCode())
    }
}
