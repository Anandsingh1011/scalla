package com.array
import scala.collection.mutable.ArrayBuffer
import java.io.{FileReader, FileNotFoundException, IOException}
import scala.io.Source
import jdk.nashorn.internal.ir.Expression

object ArrayExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(251); 

  var fru = Array("AA", "BB", "CC");System.out.println("""fru  : Array[String] = """ + $show(fru ));$skip(39); 

  var fruits = ArrayBuffer[String]();System.out.println("""fruits  : scala.collection.mutable.ArrayBuffer[String] = """ + $show(fruits ));$skip(20); val res$0 = 
  fruits += "Apple";System.out.println("""res0: scala.collection.mutable.ArrayBuffer[String] = """ + $show(res$0));$skip(21); val res$1 = 
  fruits += "Banana";System.out.println("""res1: scala.collection.mutable.ArrayBuffer[String] = """ + $show(res$1));$skip(21); val res$2 = 
  fruits += "Orange";System.out.println("""res2: scala.collection.mutable.ArrayBuffer[String] = """ + $show(res$2));$skip(85); 

  //Read file

  val filename = "C:\\Users\\ays1016\\codebase\\scalla\\README.md";System.out.println("""filename  : String = """ + $show(filename ));$skip(73); 
  for (line <- Source.fromFile(filename).getLines()) {
    println(line)
  };$skip(71); 

  val fileContents = Source.fromFile(filename).getLines.mkString;System.out.println("""fileContents  : String = """ + $show(fileContents ));$skip(65); 

  val fileLines = io.Source.fromFile(filename).getLines.toList;System.out.println("""fileLines  : List[String] = """ + $show(fileLines ));$skip(29); 
  fileLines.foreach(println);$skip(41); 

  val filename1 = "no-such-file.scala";System.out.println("""filename1  : String = """ + $show(filename1 ));$skip(265); 
  try {
    for (line <- Source.fromFile(filename1).getLines()) {
      println(line)
    }
  } catch {
  	case ex: FileNotFoundException => println("Could not find that file")
    case ex: IOException => println("Had an IOExpection while trying to read file")
  }}
}
