package com.recursion

import scala.annotation.tailrec

object Product {

	val list = List(1, 2, 3, 4)               //> list  : List[Int] = List(1, 2, 3, 4)
    println(product(List(1, 2, 3, 4)))            //> 24
    println(product2(List(1, 2, 3, 4)))           //> 24

    // (1) basic recursion; yields a "java.lang.StackOverflowError" with large lists
    def product(ints: List[Int]): Int = ints match {
        case Nil => 1
        case x :: tail => x * product(tail)
    }                                             //> product: (ints: List[Int])Int

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
  }                                               //> product2: (ints: List[Int])Int

	
}