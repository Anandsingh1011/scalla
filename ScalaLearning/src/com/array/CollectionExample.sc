package com.array

import java.util.concurrent.ConcurrentHashMap.ForEachKeyTask

object CollectionExample {

  val numbers = Array(1, 2, 3, 4, 5, 6) //> numbers  : Array[Int] = Array(1, 2, 3, 4, 5, 6)

  numbers(3) = 10

  numbers //> res0: Array[Int] = Array(1, 2, 3, 10, 5, 6)

  val numbersLi = List(1, 2, 3, 4, 5, 6) //> numbersLi  : List[Int] = List(1, 2, 3, 4, 5, 6)

  numbersLi //> res1: List[Int] = List(1, 2, 3, 4, 5, 6)

  val numberSet = Set(1, 2, 3, 4, 5, 1, 2, 3, 4) //> numberSet  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)

  numberSet //> res2: scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)

  val hostPort = ("localhost", 80) //> hostPort  : (String, Int) = (localhost,80)

  hostPort._1 //> res3: String = localhost
  hostPort._2 //> res4: Int = 80

  hostPort match {
    case ("localhost", port) => "Some data "
  } //> res5: String = "Some data "

  //--------Map
  val m = Map(1 -> "One", 2 -> "two", 3 -> "three")
  //> m  : scala.collection.immutable.Map[Int,String] = Map(1 -> One, 2 -> two, 3 
  //| -> three)

  m.get(2) //> res6: Option[String] = Some(two)

  val m1 = Map((1 -> "one"), (2 -> "two")) //> m1  : scala.collection.immutable.Map[Int,String] = Map(1 -> one, 2 -> two)

  m1.get(1) //> res7: Option[String] = Some(one)
  m1.get(5) //> res8: Option[String] = None

  def add(a: Int, b: Int) = a + b //> add: (a: Int, b: Int)Int

  val m3 = Map("add" -> { add(_, _) }) //> m3  : scala.collection.immutable.Map[String,(Int, Int) => Int] = Map(add -> 
  //| <function2>)

  m3.get("add") //> res9: Option[(Int, Int) => Int] = Some(<function2>)

  //Option
  val numbers32 = Map("one" -> 1, "two" -> 2) //> numbers32  : scala.collection.immutable.Map[String,Int] = Map(one -> 1, two 
  //| -> 2)

  numbers32.get("one") //> res10: Option[Int] = Some(1)
  numbers32.get("three") //> res11: Option[Int] = None
  println(numbers32.get("one")) //> Some(1)

  println(numbers32.getOrElse("one", "")) //> 1
  println(numbers32.getOrElse("Three", "")) //> 

  //Functional Combinators

  //map
  val num = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) //> num  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  num.map { (x: Int) => x * 2 } //> res12: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

  def twoTime(i: Int) = i * 2 //> twoTime: (i: Int)Int

  num.map { twoTime } //> res13: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  // foreach

  //-- return nothin
  num.foreach { x => x + 1 }

  num.foreach { x => println(x + 1) } //> 2
  //| 3
  //| 4
  //| 5
  //| 6
  //| 7
  //| 8
  //| 9
  //| 10
  //| 11
  // filter = removes any elements where the function you pass in evaluates to false. Functions that return a Boolean are often called predicate functions.

  num.filter { x => x > 2 } //> res14: List[Int] = List(3, 4, 5, 6, 7, 8, 9, 10)
  def isEven(x: Int): Boolean = (x % 2) == 0 //> isEven: (x: Int)Boolean

  num.filter { isEven } //> res15: List[Int] = List(2, 4, 6, 8, 10)

  // zip == zip aggregates the contents of two lists into a single list of pairs.

  List(1, 2, 3).zip(List(11, 22, 33)) //> res16: List[(Int, Int)] = List((1,11), (2,22), (3,33))
  List(3, 4, 5).zip(List("three", "four", "five")) //> res17: List[(Int, String)] = List((3,three), (4,four), (5,five))

  //partition = partition splits a list based on where it falls with respect to a predicate function.

  num.partition { x => x % 2 == 0 } //> res18: (List[Int], List[Int]) = (List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9))
  //| 

  num.partition { _ % 2 == 0 } //> res19: (List[Int], List[Int]) = (List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9))
  //| 

  num.partition { isEven } //> res20: (List[Int], List[Int]) = (List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9))
  //| 

  // find = find returns the first element of a collection that matches a predicate function.

  num.find(isEven) //> res21: Option[Int] = Some(2)
  num.find(x => x % 2 == 0) //> res22: Option[Int] = Some(2)

  num.find(_ > 4) //> res23: Option[Int] = Some(5)

  num.find((i: Int) => (i > 4)) //> res24: Option[Int] = Some(5)
  //drop : drop drops the first i elements

  num.drop(3) //> res25: List[Int] = List(4, 5, 6, 7, 8, 9, 10)

  num.dropWhile(_ % 2 != 0) //> res26: List[Int] = List(2, 3, 4, 5, 6, 7, 8, 9, 10)

  //foldLeft and foldRight

  num.foldLeft(0)((m: Int, n: Int) => m + n) //> res27: Int = 55
  num.foldRight(0)((m: Int, n: Int) => m + n) //> res28: Int = 55

  //flatten = flatten collapses one level of nested structure.

  List(List(1, 2), List(3, 4)).flatten //> res29: List[Int] = List(1, 2, 3, 4)

  //flatMap is a frequently used combinator that combines mapping and flattening. flatMap takes a function that works on the nested lists and then concatenates the results back together.

  val nestedNum = List(List(1, 2), List(3, 4)) //> nestedNum  : List[List[Int]] = List(List(1, 2), List(3, 4))

  nestedNum.flatMap { x => x } //> res30: List[Int] = List(1, 2, 3, 4)
  nestedNum.flatMap { x => x.map { _ * 2 } }
  //> res31: List[Int] = List(2, 4, 6, 8)
}