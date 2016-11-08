package com.forloop

object ListExamp {

  case class Student(id: Int, name: String, age: Int);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(222); 

  var students = List(Student(1, "Anand", 34), Student(2, "Mohit", 45), Student(3, "Ramesh", 24), Student(4, "Manish", 22));System.out.println("""students  : List[com.forloop.ListExamp.Student] = """ + $show(students ));$skip(18); val res$0 = 

  students.head;System.out.println("""res0: com.forloop.ListExamp.Student = """ + $show(res$0));$skip(21); val res$1 = 
  students.tail.head;System.out.println("""res1: com.forloop.ListExamp.Student = """ + $show(res$1));$skip(21); val res$2 = 

  students.take(2);System.out.println("""res2: List[com.forloop.ListExamp.Student] = """ + $show(res$2));$skip(38); val res$3 = 
  students.filter { x => x.age > 25 };System.out.println("""res3: List[com.forloop.ListExamp.Student] = """ + $show(res$3));$skip(52); 
  var part = students.partition { x => x.age > 25 };System.out.println("""part  : (List[com.forloop.ListExamp.Student], List[com.forloop.ListExamp.Student]) = """ + $show(part ));$skip(10); val res$4 = 
  part._1;System.out.println("""res4: List[com.forloop.ListExamp.Student] = """ + $show(res$4));$skip(12); val res$5 = 

  part._2;System.out.println("""res5: List[com.forloop.ListExamp.Student] = """ + $show(res$5));$skip(98); 

  //================================================================
  var x = List(3, 4, 5, 6);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(24); 
  x.foreach { println };$skip(14); 
  var sum = 0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(27); 

  x.foreach { sum += _ };$skip(17); 

  println(sum);$skip(61); 

  val names = Vector("Bob", "Fred", "Joe", "Julia", "Kim");System.out.println("""names  : scala.collection.immutable.Vector[String] = """ + $show(names ));$skip(38); 

  for (name <- names) println(name);$skip(60); 
   for(name <- names if name.startsWith("J")) println(name)}
}
