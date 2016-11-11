package com.array

import java.util.concurrent.ConcurrentHashMap.ForEachKeyTask

object CollectionExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(151); 

  val numbers = Array(1, 2, 3, 4, 5, 6);System.out.println("""numbers  : Array[Int] = """ + $show(numbers ));$skip(20); 

  numbers(3) = 10;$skip(12); val res$0 = 

  numbers;System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(43); 

  val numbersLi = List(1, 2, 3, 4, 5, 6);System.out.println("""numbersLi  : List[Int] = """ + $show(numbersLi ));$skip(14); val res$1 = 

  numbersLi;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(51); 

  val numberSet = Set(1, 2, 3, 4, 5, 1, 2, 3, 4);System.out.println("""numberSet  : scala.collection.immutable.Set[Int] = """ + $show(numberSet ));$skip(14); val res$2 = 

  numberSet;System.out.println("""res2: scala.collection.immutable.Set[Int] = """ + $show(res$2));$skip(37); 

  val hostPort = ("localhost", 80);System.out.println("""hostPort  : (String, Int) = """ + $show(hostPort ));$skip(16); val res$3 = 

  hostPort._1;System.out.println("""res3: String = """ + $show(res$3));$skip(14); val res$4 = 
  hostPort._2;System.out.println("""res4: Int = """ + $show(res$4));$skip(70); val res$5 = 

  hostPort match {
    case ("localhost", port) => "Some data "
  };System.out.println("""res5: String = """ + $show(res$5));$skip(70); 

  //--------Map
  val m = Map(1 -> "One", 2 -> "two", 3 -> "three");System.out.println("""m  : scala.collection.immutable.Map[Int,String] = """ + $show(m ));$skip(13); val res$6 = 

  m.get(2);System.out.println("""res6: Option[String] = """ + $show(res$6));$skip(45); 

  val m1 = Map((1 -> "one"), (2 -> "two"));System.out.println("""m1  : scala.collection.immutable.Map[Int,String] = """ + $show(m1 ));$skip(14); val res$7 = 

  m1.get(1);System.out.println("""res7: Option[String] = """ + $show(res$7));$skip(12); val res$8 = 
  m1.get(5);System.out.println("""res8: Option[String] = """ + $show(res$8));$skip(36); 

  def add(a: Int, b: Int) = a + b;System.out.println("""add: (a: Int, b: Int)Int""");$skip(41); 

  val m3 = Map("add" -> { add(_, _) });System.out.println("""m3  : scala.collection.immutable.Map[String,(Int, Int) => Int] = """ + $show(m3 ));$skip(18); val res$9 = 

  m3.get("add");System.out.println("""res9: Option[(Int, Int) => Int] = """ + $show(res$9));$skip(59); 

  //Option
  val numbers32 = Map("one" -> 1, "two" -> 2);System.out.println("""numbers32  : scala.collection.immutable.Map[String,Int] = """ + $show(numbers32 ));$skip(25); val res$10 = 

  numbers32.get("one");System.out.println("""res10: Option[Int] = """ + $show(res$10));$skip(25); val res$11 = 
  numbers32.get("three");System.out.println("""res11: Option[Int] = """ + $show(res$11));$skip(32); 
  println(numbers32.get("one"));$skip(44); 

  println(numbers32.getOrElse("one", ""));$skip(44); 
  println(numbers32.getOrElse("Three", ""));$skip(87); 

  //Functional Combinators

  //map
  val num = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);System.out.println("""num  : List[Int] = """ + $show(num ));$skip(34); val res$12 = 

  num.map { (x: Int) => x * 2 };System.out.println("""res12: List[Int] = """ + $show(res$12));$skip(32); 

  def twoTime(i: Int) = i * 2;System.out.println("""twoTime: (i: Int)Int""");$skip(24); val res$13 = 

  num.map { twoTime };System.out.println("""res13: List[Int] = """ + $show(res$13));$skip(65); 
  // foreach

  //-- return nothin
  num.foreach { x => x + 1 };$skip(40); 

  num.foreach { x => println(x + 1) };$skip(186); val res$14 = 
  // filter = removes any elements where the function you pass in evaluates to false. Functions that return a Boolean are often called predicate functions.

  num.filter { x => x > 2 };System.out.println("""res14: List[Int] = """ + $show(res$14));$skip(45); 
  def isEven(x: Int): Boolean = (x % 2) == 0;System.out.println("""isEven: (x: Int)Boolean""");$skip(26); val res$15 = 

  num.filter { isEven };System.out.println("""res15: List[Int] = """ + $show(res$15));$skip(124); val res$16 = 

  // zip == zip aggregates the contents of two lists into a single list of pairs.

  List(1, 2, 3).zip(List(11, 22, 33));System.out.println("""res16: List[(Int, Int)] = """ + $show(res$16));$skip(51); val res$17 = 
  List(3, 4, 5).zip(List("three", "four", "five"));System.out.println("""res17: List[(Int, String)] = """ + $show(res$17));$skip(142); val res$18 = 

  //partition = partition splits a list based on where it falls with respect to a predicate function.

  num.partition { x => x % 2 == 0 };System.out.println("""res18: (List[Int], List[Int]) = """ + $show(res$18));$skip(33); val res$19 = 

  num.partition { _ % 2 == 0 };System.out.println("""res19: (List[Int], List[Int]) = """ + $show(res$19));$skip(29); val res$20 = 

  num.partition { isEven };System.out.println("""res20: (List[Int], List[Int]) = """ + $show(res$20));$skip(117); val res$21 = 

  // find = find returns the first element of a collection that matches a predicate function.

  num.find(isEven);System.out.println("""res21: Option[Int] = """ + $show(res$21));$skip(28); val res$22 = 
  num.find(x => x % 2 == 0);System.out.println("""res22: Option[Int] = """ + $show(res$22));$skip(20); val res$23 = 

  num.find(_ > 4);System.out.println("""res23: Option[Int] = """ + $show(res$23));$skip(34); val res$24 = 

  num.find((i: Int) => (i > 4));System.out.println("""res24: Option[Int] = """ + $show(res$24));$skip(59); val res$25 = 
  //drop : drop drops the first i elements

  num.drop(3);System.out.println("""res25: List[Int] = """ + $show(res$25));$skip(30); val res$26 = 

  num.dropWhile(_ % 2 != 0);System.out.println("""res26: List[Int] = """ + $show(res$26));$skip(76); val res$27 = 

  //foldLeft and foldRight

  num.foldLeft(0)((m: Int, n: Int) => m + n);System.out.println("""res27: Int = """ + $show(res$27));$skip(46); val res$28 = 
  num.foldRight(0)((m: Int, n: Int) => m + n);System.out.println("""res28: Int = """ + $show(res$28));$skip(106); val res$29 = 

  //flatten = flatten collapses one level of nested structure.

  List(List(1, 2), List(3, 4)).flatten;System.out.println("""res29: List[Int] = """ + $show(res$29));$skip(238); 

  //flatMap is a frequently used combinator that combines mapping and flattening. flatMap takes a function that works on the nested lists and then concatenates the results back together.

  val nestedNum = List(List(1, 2), List(3, 4));System.out.println("""nestedNum  : List[List[Int]] = """ + $show(nestedNum ));$skip(33); val res$30 = 

  nestedNum.flatMap { x => x };System.out.println("""res30: List[Int] = """ + $show(res$30));$skip(45); val res$31 = 
  nestedNum.flatMap { x => x.map { _ * 2 } };System.out.println("""res31: List[Int] = """ + $show(res$31))}
}
