package com

object workSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val st = "anand"                                //> st  : String = anand

  st.foreach { x => { println(x) } }              //> a
                                                  //| n
                                                  //| a
                                                  //| n
                                                  //| d

  def totel(list: List[Int],
    selector: Int => Boolean) {

    var sum = 0
    list.foreach { x =>
      if (selector(x)) sum += x
    }
    sum
  }                                               //> totel: (list: List[Int], selector: Int => Boolean)Unit

  println(totel(List(1, 2, 3, 4, 5, 24, 45, 56), { x => true }))
                                                  //> ()
  val a = "Anand"                                 //> a  : String = Anand

}