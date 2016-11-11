package com.array

object CollectionExample {

  val numbers = Array(1, 2, 3, 4, 5, 6)           //> numbers  : Array[Int] = Array(1, 2, 3, 4, 5, 6)

  numbers(3) = 10

  numbers                                         //> res0: Array[Int] = Array(1, 2, 3, 10, 5, 6)

  val numbersLi = List(1, 2, 3, 4, 5, 6)          //> numbersLi  : List[Int] = List(1, 2, 3, 4, 5, 6)

  numbersLi                                       //> res1: List[Int] = List(1, 2, 3, 4, 5, 6)

  val numberSet = Set(1, 2, 3, 4, 5, 1, 2, 3, 4)  //> numberSet  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)

  numberSet                                       //> res2: scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)

  val hostPort = ("localhost", 80)                //> hostPort  : (String, Int) = (localhost,80)

  hostPort._1                                     //> res3: String = localhost
  hostPort._2                                     //> res4: Int = 80

  hostPort match {
    case ("localhost", port) => "Some data "
  }                                               //> res5: String = "Some data "

  val m = Map(1 -> "One", 2 -> "two", 3 -> "three")
                                                  //> m  : scala.collection.immutable.Map[Int,String] = Map(1 -> One, 2 -> two, 3 
                                                  //| -> three)

  m.get(2)                                        //> res6: Option[String] = Some(two)

  val m1 = Map((1 -> "one"), (2 -> "two"))        //> m1  : scala.collection.immutable.Map[Int,String] = Map(1 -> one, 2 -> two)

	m1.get(1)                                 //> res7: Option[String] = Some(one)
	m1.get(5)                                 //> res8: Option[String] = None
	

	
  def add(a: Int, b: Int) = a + b                 //> add: (a: Int, b: Int)Int

  val m3 = Map("add" -> { add(_, _) })            //> m3  : scala.collection.immutable.Map[String,(Int, Int) => Int] = Map(add -> 
                                                  //| <function2>)

  m3.get("add")                                   //> res9: Option[(Int, Int) => Int] = Some(<function2>)
}