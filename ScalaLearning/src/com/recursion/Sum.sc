package com

import scala.annotation.tailrec

object Sum {

  val list = List.range(1, 100)                   //> list  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1
                                                  //| 6, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35
                                                  //| , 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54,
                                                  //|  55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 
                                                  //| 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 9
                                                  //| 3, 94, 95, 96, 97, 98, 99)
  println(sum(list))                              //> 4950
  println(sum2(list))                             //> 4950
  println(sum3(list))                             //> 4950
  println(sumWithReduce(list))                    //> 4950

  // (1) yields a "java.lang.StackOverflowError" with large lists
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case x :: tail => x + sum(tail)
  }                                               //> sum: (ints: List[Int])Int

  // (2) tail-recursive solution
  def sum2(ints: List[Int]): Int = {
    @tailrec
    def sumAccumulator(ints: List[Int], accum: Int): Int = {
      ints match {
        case Nil => accum
        case x :: tail => sumAccumulator(tail, accum + x)
      }
    }
    sumAccumulator(ints, 0)
  }                                               //> sum2: (ints: List[Int])Int

  // (3) good descriptions of recursion here:
  // stackoverflow.com/questions/12496959/summing-values-in-a-list
  // this example is from that page:
  def sum3(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + sum3(xs.tail)
  }                                               //> sum3: (xs: List[Int])Int

  def sumWithReduce(ints: List[Int]) = {
    ints.reduceLeft(_ + _)
                                                  //> sumWithReduce: (ints: List[Int])Int }
}