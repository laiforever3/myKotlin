package com.laiforever333.mykotlin

import android.util.Log
import java.net.URL

/**
 * Created by Administrator on 2017/6/21.
 */
public class Request {
    val tag = "Request"

    public fun run(url: String) {
        val str = URL(url).readText()
        Log.e(tag, "str$str")
    }


}