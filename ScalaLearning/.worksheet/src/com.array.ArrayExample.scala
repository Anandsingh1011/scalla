package com.array
import scala.collection.mutable.ArrayBuffer
import java.io.{ FileReader, FileNotFoundException, IOException }
import scala.io.Source
import jdk.nashorn.internal.ir.Expression

object ArrayExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(254); 

  var fru = Array("AA", "BB", "CC");System.out.println("""fru  : Array[String] = """ + $show(fru ));$skip(39); 

  var fruits = ArrayBuffer[String]();System.out.println("""fruits  : scala.collection.mutable.ArrayBuffer[String] = """ + $show(fruits ));$skip(20); val res$0 = 
  fruits += "Apple";System.out.println("""res0: scala.collection.mutable.ArrayBuffer[String] = """ + $show(res$0));$skip(21); val res$1 = 
  fruits += "Banana";System.out.println("""res1: scala.collection.mutable.ArrayBuffer[String] = """ + $show(res$1));$skip(21); val res$2 = 
  fruits += "Orange";System.out.println("""res2: scala.collection.mutable.ArrayBuffer[String] = """ + $show(res$2));$skip(34); 

  val so = new Array[String](3);System.out.println("""so  : Array[String] = """ + $show(so ));$skip(17); 
  so(0) = "Some";$skip(18); 
  so(2) = "Thing";$skip(7); val res$3 = 

  so;System.out.println("""res3: Array[String] = """ + $show(res$3))}

}
