package com.recursion

import scala.annotation.tailrec

object Max  {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(105); 

  val list = List.range(1, 100000);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(21); 
  println(max(list));$skip(22); 
  println(max2(list));$skip(329); 
  
  // 1 - using `match`
  def max(ints: List[Int]): Int = {
    @tailrec
    def maxAccum(ints: List[Int], theMax: Int): Int = {
      ints match {
        case Nil => theMax
        case x :: tail =>
          val newMax = if (x > theMax) x else theMax
          maxAccum(tail, newMax)
      }
    }
    maxAccum(ints, 0)
  };System.out.println("""max: (ints: List[Int])Int""");$skip(339); 

  // 2 - using if/else
  def max2(ints: List[Int]): Int = {
    @tailrec
    def maxAccum2(ints: List[Int], theMax: Int): Int = {
      if (ints.isEmpty) {
        return theMax
      } else {
        val newMax = if (ints.head > theMax) ints.head else theMax
        maxAccum2(ints.tail, newMax)
      }
    }
    maxAccum2(ints, 0)
  };System.out.println("""max2: (ints: List[Int])Int""")}

}
