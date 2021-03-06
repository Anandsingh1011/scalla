package com.forloop

object ListExamp {

  case class Student(id: Int, name: String, age: Int)

  var students = List(Student(1, "Anand", 34), Student(2, "Mohit", 45), Student(3, "Ramesh", 24), Student(4, "Manish", 22))
                                                  //> students  : List[com.forloop.ListExamp.Student] = List(Student(1,Anand,34), 
                                                  //| Student(2,Mohit,45), Student(3,Ramesh,24), Student(4,Manish,22))

  students.head                                   //> res0: com.forloop.ListExamp.Student = Student(1,Anand,34)
  students.tail.head                              //> res1: com.forloop.ListExamp.Student = Student(2,Mohit,45)

  students.take(2)                                //> res2: List[com.forloop.ListExamp.Student] = List(Student(1,Anand,34), Studen
                                                  //| t(2,Mohit,45))
  students.filter { x => x.age > 25 }             //> res3: List[com.forloop.ListExamp.Student] = List(Student(1,Anand,34), Studen
                                                  //| t(2,Mohit,45))
  var part = students.partition { x => x.age > 25 }
                                                  //> part  : (List[com.forloop.ListExamp.Student], List[com.forloop.ListExamp.Stu
                                                  //| dent]) = (List(Student(1,Anand,34), Student(2,Mohit,45)),List(Student(3,Rame
                                                  //| sh,24), Student(4,Manish,22)))
  part._1                                         //> res4: List[com.forloop.ListExamp.Student] = List(Student(1,Anand,34), Studen
                                                  //| t(2,Mohit,45))

  part._2                                         //> res5: List[com.forloop.ListExamp.Student] = List(Student(3,Ramesh,24), Stude
                                                  //| nt(4,Manish,22))

  //================================================================
  var x = List(3, 4, 5, 6)                        //> x  : List[Int] = List(3, 4, 5, 6)
  x.foreach { println }                           //> 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
  var sum = 0                                     //> sum  : Int = 0

  x.foreach { sum += _ }

  println(sum)                                    //> 18

  val names = Vector("Bob", "Fred", "Joe", "Julia", "Kim")
                                                  //> names  : scala.collection.immutable.Vector[String] = Vector(Bob, Fred, Joe, 
                                                  //| Julia, Kim)

  for (name <- names) println(name)               //> Bob
                                                  //| Fred
                                                  //| Joe
                                                  //| Julia
                                                  //| Kim
   for(name <- names if name.startsWith("J")) println(name)
                                                  //> Joe
                                                  //| Julia
}