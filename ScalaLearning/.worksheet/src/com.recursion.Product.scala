package com.recursion

import scala.annotation.tailrec

object Product {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(102); 

	val list = List(1, 2, 3, 4);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(39); 
    println(product(List(1, 2, 3, 4)));$skip(40); 
    println(product2(List(1, 2, 3, 4)));$skip(211); 

    // (1) basic recursion; yields a "java.lang.StackOverflowError" with large lists
    def product(ints: List[Int]): Int = ints match {
        case Nil => 1
        case x :: tail => x * product(tail)
    };System.out.println("""product: (ints: List[Int])Int""");$skip(342); 

    // (2) tail-recursive solution
    def product2(ints: List[Int]): Int = {
      @tailrec
      def productAccumulator(ints: List[Int], accum: Int): Int = {
          ints match {
              case Nil => accum
              case x :: tail => productAccumulator(tail, accum * x)
          }
      }
      productAccumulator(ints, 1)
  };System.out.println("""product2: (ints: List[Int])Int""")}

	
}
