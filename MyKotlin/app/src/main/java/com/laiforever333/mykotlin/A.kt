package com.laiforever333.mykotlin

import android.util.Log

/**
 * Created by Administrator on 2017/6/22.
 */
open class A {
    open fun f() {
        Log.e("TAG", "A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        Log.e("TAG", "B")
    } // interface members are 'open' by default

    fun b() {
        print("b")
    }
}

class C() : A(), B {
    // The compiler requires f() to be overridden:
    override fun f() {
       // super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }

}