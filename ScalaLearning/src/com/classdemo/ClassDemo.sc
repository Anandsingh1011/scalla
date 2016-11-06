package com.classdemo

import scala.collection.mutable.ListBuffer

object ClassDemo {

  //With getter setter
  case class Person(var firstName: String = "", var lastName: String = "", var age: Int = 0) {
    def setFirstName(s: String) { firstName = s }
    def setLastName(s: String) { lastName = s }
    def setAge(i: Int) { age = i }
  }

  case class Student1(var name: String = "Anand", var roolNum: Int = 1222, var age: Int = 12) {

    def >(st: Student1): Boolean = roolNum > st.roolNum
    
  }

  var s1 = new Student1("Mani", 1, 10)            //> s1  : com.classdemo.ClassDemo.Student1 = Student1(Mani,1,10)
  var s2 = Student1("Rahul", 2, 15)               //> s2  : com.classdemo.ClassDemo.Student1 = Student1(Rahul,2,15)

	s1 > s2                                   //> res0: Boolean = false


  var p = new Person()                            //> p  : com.classdemo.ClassDemo.Person = Person(,,0)
}