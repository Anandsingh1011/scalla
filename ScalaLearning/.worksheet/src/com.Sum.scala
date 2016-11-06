package com

import scala.annotation.tailrec

object Sum {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 

  val list = List.range(1, 100);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(21); 
  println(sum(list));$skip(22); 
  println(sum2(list));$skip(22); 
  println(sum3(list));$skip(31); 
  println(sumWithReduce(list));$skip(172); 

  // (1) yields a "java.lang.StackOverflowError" with large lists
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case x :: tail => x + sum(tail)
  };System.out.println("""sum: (ints: List[Int])Int""");$skip(294); 

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
  };System.out.println("""sum2: (ints: List[Int])Int""");$skip(245); 

  // (3) good descriptions of recursion here:
  // stackoverflow.com/questions/12496959/summing-values-in-a-list
  // this example is from that page:
  def sum3(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + sum3(xs.tail)
  };System.out.println("""sum3: (xs: List[Int])Int""");$skip(71); 
  
  def sumWithReduce(ints: List[Int]) = {
  ints.reduceLeft(_ + _)
};System.out.println("""sumWithReduce: (ints: List[Int])Int""")}
}
