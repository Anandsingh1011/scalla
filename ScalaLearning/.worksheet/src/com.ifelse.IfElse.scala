package com.ifelse

import java.util.Calendar

import java.text.SimpleDateFormat

object IfElse {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 

val a = 10;System.out.println("""a  : Int = """ + $show(a ));$skip(11); 
val b = 45;System.out.println("""b  : Int = """ + $show(b ));$skip(29); 

val x = if (a > b) a else b;System.out.println("""x  : Int = """ + $show(x ));$skip(41); 

def abs(x: Int) = if (x >= 0) x else -x;System.out.println("""abs: (x: Int)Int""");$skip(10); val res$0 = 

abs(-15);System.out.println("""res0: Int = """ + $show(res$0))}


}
