package com.laiforever333.ankokotlin

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.laiforever333.mykotlin.Request
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.resources
        doAsync {
            Request().run("https://github.com/wangjiegulu/kotlin-for-android-developers-zh/issues")
        }
        doAsyncResult() {
            uiThread {  }
            onComplete {  }
        }
    }
}
