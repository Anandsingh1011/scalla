package com.fileOperation

import scala.collection.mutable.ArrayBuffer
import java.io.{ FileReader, FileNotFoundException, IOException }
import scala.io.Source
import jdk.nashorn.internal.ir.Expression

object FileExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(306); 

  //Read file

  val filename = "C:\\Users\\ays1016\\codebase\\scalla\\README.md";System.out.println("""filename  : String = """ + $show(filename ));$skip(78); 
 

 
  for (line <- Source.fromFile(filename).getLines()) {
    println(line)
  };$skip(70); 

  val fileContents = Source.fromFile(filename).getLines.mkString;System.out.println("""fileContents  : String = """ + $show(fileContents ));$skip(64); 

  val fileLines = io.Source.fromFile(filename).getLines.toList;System.out.println("""fileLines  : List[String] = """ + $show(fileLines ));$skip(29); 
  fileLines.foreach(println);$skip(40); 

  val filename1 = "no-such-file.scala";System.out.println("""filename1  : String = """ + $show(filename1 ));$skip(266); 
  try {
    for (line <- Source.fromFile(filename1).getLines()) {
      println(line)
    }
  } catch {
    case ex: FileNotFoundException => println("Could not find that file")
    case ex: IOException => println("Had an IOExpection while trying to read file")
  }}
}
