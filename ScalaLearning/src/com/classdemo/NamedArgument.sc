package com.classdemo

object NamedArgument {

  def main(args: Array[String]) {

    printName(fName = "Anand", lName = "Singh")

  }                                               //> main: (args: Array[String])Unit

  def printName(fName: String = "Unknown", lName: String = "Unknown") {
    println(fName + " , " + lName)
  }                                               //> printName: (fName: String, lName: String)Unit

  printName(fName = "Anand", lName = "Singh")     //> Anand , Singh
  
  printName(fName = "Anand")                      //> Anand , Unknown
  
  printName(lName = "Singh")                      //> Unknown , Singh
  
  printName("Anand")                              //> Anand , Unknown
  
  printName()                                     //> Unknown , Unknown
}