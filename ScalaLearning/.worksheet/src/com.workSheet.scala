package com

object workSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(21); 

  val st = "anand";System.out.println("""st  : String = """ + $show(st ));$skip(39); 

  st.foreach { x => { println(x) } };$skip(155); 

  def totel(list: List[Int],
    selector: Int => Boolean) {

    var sum = 0
    list.foreach { x =>
      if (selector(x)) sum += x
    }
    sum
  };System.out.println("""totel: (list: List[Int], selector: Int => Boolean)Unit""");$skip(67); 

  println(totel(List(1, 2, 3, 4, 5, 24, 45, 56), { x => true }));$skip(18); 
  val a = "Anand";System.out.println("""a  : String = """ + $show(a ))}

}
