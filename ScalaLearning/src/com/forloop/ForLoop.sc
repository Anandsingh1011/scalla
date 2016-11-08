package com.forloop

object ForLoop {

  for (i <- 1 to 10) yield i                      //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
  for (i <- 1 to 5) yield i * 2                   //> res1: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10)

  val a = Array(1, 2, 3, 4, 5, 6)                 //> a  : Array[Int] = Array(1, 2, 3, 4, 5, 6)

  for (i <- a) yield i                            //> res2: Array[Int] = Array(1, 2, 3, 4, 5, 6)

  for (i <- a if i > 3) yield i                   //> res3: Array[Int] = Array(4, 5, 6)
  for (i <- a if i > 3) yield i * 2               //> res4: Array[Int] = Array(8, 10, 12)

  def someMethod = for (i <- a if i > 3) yield i  //> someMethod: => Array[Int]

  someMethod                                      //> res5: Array[Int] = Array(4, 5, 6)

  def someMethod1(aa: Array[Int]) = { for (i <- aa if i > 3) yield i }
                                                  //> someMethod1: (aa: Array[Int])Array[Int]

  someMethod1(a)                                  //> res6: Array[Int] = Array(4, 5, 6)
 
	def add = {}                              //> add: => Unit
	
	
	var li = List(22,13,4,15,16,7)            //> li  : List[Int] = List(22, 13, 4, 15, 16, 7)
	
	var reverseList = li.reverse              //> reverseList  : List[Int] = List(7, 16, 15, 4, 13, 22)
	
	li.sortBy { x => x }                      //> res7: List[Int] = List(4, 7, 13, 15, 16, 22)
	
	li.drop(2).take(3)                        //> res8: List[Int] = List(4, 15, 16)
	
	li.foreach { x => println(x) }            //> 22
                                                  //| 13
                                                  //| 4
                                                  //| 15
                                                  //| 16
                                                  //| 7
                                                  
                                                
                                                  
                                                  
}