package com.array

object CollectionExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 

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
  };System.out.println("""res5: String = """ + $show(res$5));$skip(54); 

  val m = Map(1 -> "One", 2 -> "two", 3 -> "three");System.out.println("""m  : scala.collection.immutable.Map[Int,String] = """ + $show(m ));$skip(13); val res$6 = 

  m.get(2);System.out.println("""res6: Option[String] = """ + $show(res$6));$skip(45); 

  val m1 = Map((1 -> "one"), (2 -> "two"));System.out.println("""m1  : scala.collection.immutable.Map[Int,String] = """ + $show(m1 ));$skip(12); val res$7 = 

	m1.get(1);System.out.println("""res7: Option[String] = """ + $show(res$7));$skip(11); val res$8 = 
	m1.get(5);System.out.println("""res8: Option[String] = """ + $show(res$8));$skip(40); 
	

	
  def add(a: Int, b: Int) = a + b;System.out.println("""add: (a: Int, b: Int)Int""");$skip(41); 

  val m3 = Map("add" -> { add(_, _) });System.out.println("""m3  : scala.collection.immutable.Map[String,(Int, Int) => Int] = """ + $show(m3 ));$skip(18); val res$9 = 

  m3.get("add");System.out.println("""res9: Option[(Int, Int) => Int] = """ + $show(res$9))}
}
