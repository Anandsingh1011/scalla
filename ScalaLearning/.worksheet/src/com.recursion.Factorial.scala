package com.recursion
import scala.annotation.tailrec

object Factorial  {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(101); 

    println(factorial(5));$skip(27); 
    println(factorial2(5));$skip(147); 

    // 1 - basic recursive factorial method
    def factorial(n: Int): Int = {
        if (n == 0) 1
        else        n * factorial(n-1)
    };System.out.println("""factorial: (n: Int)Int""");$skip(293); 
  
    // 2 - tail-recursive factorial method
    def factorial2(n: Long): Long = {
        @tailrec
        def factorialAccumulator(acc: Long, n: Long): Long = {
            if (n == 0) acc
            else factorialAccumulator(n*acc, n-1)
        }
        factorialAccumulator(1, n)
    };System.out.println("""factorial2: (n: Long)Long""")}
 
}
