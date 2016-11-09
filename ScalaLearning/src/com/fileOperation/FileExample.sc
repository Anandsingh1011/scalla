package com.fileOperation

import scala.collection.mutable.ArrayBuffer
import java.io.{ FileReader, FileNotFoundException, IOException }
import scala.io.Source
import jdk.nashorn.internal.ir.Expression

object FileExample {

  //Read file

  val filename = "C:\\Users\\ays1016\\codebase\\scalla\\README.md"
                                                  //> filename  : String = C:\Users\ays1016\codebase\scalla\README.md
 

 
  for (line <- Source.fromFile(filename).getLines()) {
    println(line)                                 //> # scalla
                                                  //| 
                                                  //| Scalla Program
                                                  //| Object-Oriented Meets Functional
                                                  //| Have the best of both worlds. 
                                                  //| Construct elegant class hierarchies for maximum code reuse and extensibility
                                                  //| ,
                                                  //|  implement their behavior using higher-order functions. Or anything in-betwe
                                                  //| en.
  }

  val fileContents = Source.fromFile(filename).getLines.mkString
                                                  //> fileContents  : String = # scallaScalla ProgramObject-Oriented Meets Functio
                                                  //| nalHave the best of both worlds. Construct elegant class hierarchies for max
                                                  //| imum code reuse and extensibility, implement their behavior using higher-ord
                                                  //| er functions. Or anything in-between.

  val fileLines = io.Source.fromFile(filename).getLines.toList
                                                  //> fileLines  : List[String] = List(# scalla, "", Scalla Program, Object-Orient
                                                  //| ed Meets Functional, "Have the best of both worlds. ", Construct elegant cla
                                                  //| ss hierarchies for maximum code reuse and extensibility,, " implement their 
                                                  //| behavior using higher-order functions. Or anything in-between.")
  fileLines.foreach(println)                      //> # scalla
                                                  //| 
                                                  //| Scalla Program
                                                  //| Object-Oriented Meets Functional
                                                  //| Have the best of both worlds. 
                                                  //| Construct elegant class hierarchies for maximum code reuse and extensibility
                                                  //| ,
                                                  //|  implement their behavior using higher-order functions. Or anything in-betwe
                                                  //| en.

  val filename1 = "no-such-file.scala"            //> filename1  : String = no-such-file.scala
  try {
    for (line <- Source.fromFile(filename1).getLines()) {
      println(line)
    }
  } catch {
    case ex: FileNotFoundException => println("Could not find that file")
    case ex: IOException => println("Had an IOExpection while trying to read file")
  }                                               //> Could not find that file
}