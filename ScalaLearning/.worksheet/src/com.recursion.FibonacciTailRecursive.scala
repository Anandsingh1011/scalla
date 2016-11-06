package com.recursion
import scala.annotation.tailrec

/**
 * The `fibHelper` code comes from this url: rosettacode.org/wiki/Fibonacci_sequence#Scala
 */
object FibonacciTailRecursive {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(206); 

  println(fib(9));$skip(246); 

  def fib(x: Int): BigInt = {
    @tailrec def fibHelper(x: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = x match {
      case 0 => prev
      case 1 => next
      case _ => fibHelper(x - 1, next, (next + prev))
    }
    fibHelper(x)
  };System.out.println("""fib: (x: Int)BigInt""")}


}
