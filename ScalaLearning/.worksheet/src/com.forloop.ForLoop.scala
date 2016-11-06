package com.forloop

object ForLoop {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); val res$0 = 

  for (i <- 1 to 10) yield i;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$0));$skip(32); val res$1 = 
  for (i <- 1 to 5) yield i * 2;System.out.println("""res1: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$1));$skip(36); 

  val a = Array(1, 2, 3, 4, 5, 6);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(25); val res$2 = 

  for (i <- a) yield i;System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(34); val res$3 = 

  for (i <- a if i > 3) yield i;System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(36); val res$4 = 
  for (i <- a if i > 3) yield i * 2;System.out.println("""res4: Array[Int] = """ + $show(res$4));$skip(51); 

  def someMethod = for (i <- a if i > 3) yield i;System.out.println("""someMethod: => Array[Int]""");$skip(15); val res$5 = 

  someMethod;System.out.println("""res5: Array[Int] = """ + $show(res$5));$skip(73); 

  def someMethod1(aa: Array[Int]) = { for (i <- aa if i > 3) yield i };System.out.println("""someMethod1: (aa: Array[Int])Array[Int]""");$skip(19); val res$6 = 

  someMethod1(a);System.out.println("""res6: Array[Int] = """ + $show(res$6));$skip(16); 
 
	def add = {};System.out.println("""add: => Unit""");$skip(36); 
	
	
	var li = List(22,13,4,15,16,7);System.out.println("""li  : List[Int] = """ + $show(li ));$skip(32); 
	
	var reverseList = li.reverse;System.out.println("""reverseList  : List[Int] = """ + $show(reverseList ));$skip(24); val res$7 = 
	
	li.sortBy { x => x };System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(22); val res$8 = 
	
	li.drop(2).take(3);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(34); 
	
	li.foreach { x => println(x) }}
}
