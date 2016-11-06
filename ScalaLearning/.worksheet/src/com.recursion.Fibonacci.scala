package com.recursion
/**
 * Calculating a Fibonacci sequence recursively using Scala.
 */
object Fibonacci  {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(134); 

    println(fib(1, 2));$skip(173); 
  
    def fib(prevPrev: Int, prev: Int) {
        val next = prevPrev + prev
        println(next)
        if (next > 1000000) System.exit(0)
        fib(prev, next)
    };System.out.println("""fib: (prevPrev: Int, prev: Int)Unit""")}

}
