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
    
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(550); 

  var s1 = new Student1("Mani", 1, 10);System.out.println("""s1  : com.classdemo.ClassDemo.Student1 = """ + $show(s1 ));$skip(36); 
  var s2 = Student1("Rahul", 2, 15);System.out.println("""s2  : com.classdemo.ClassDemo.Student1 = """ + $show(s2 ));$skip(11); val res$0 = 

	s1 > s2;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(27); 


  var p = new Person();System.out.println("""p  : com.classdemo.ClassDemo.Person = """ + $show(p ))}
}
