package com.ifelse

import java.util.Calendar

import java.text.SimpleDateFormat

object IfElse {

val a = 10                                        //> a  : Int = 10
val b = 45                                        //> b  : Int = 45

val x = if (a > b) a else b                       //> x  : Int = 45

def abs(x: Int) = if (x >= 0) x else -x           //> abs: (x: Int)Int

abs(-15)                                          //> res0: Int = 15


}