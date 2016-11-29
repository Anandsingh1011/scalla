package com.classdemo

import javafx.application.Application

class Student(name: String = "Anand", val roolNum: Int = 1222, val age: Int = 12) {

  require(roolNum > 10)
  println("Creating Object ")
  override def toString = name + ", " + roolNum + ""
}

object Student1 {

  def main(args: Array[String]): Unit = {
    val a = new Student()

    val b = new Student("Manu",9)
    println(b)

  }
}

