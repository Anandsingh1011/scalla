package com.array
import scala.collection.mutable.ArrayBuffer
import java.io.{ FileReader, FileNotFoundException, IOException }
import scala.io.Source
import jdk.nashorn.internal.ir.Expression

object ArrayExample {

  var fru = Array("AA", "BB", "CC")               //> fru  : Array[String] = Array(AA, BB, CC)

  var fruits = ArrayBuffer[String]()              //> fruits  : scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer()
  fruits += "Apple"                               //> res0: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Apple)
  fruits += "Banana"                              //> res1: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Apple, Bana
                                                  //| na)
  fruits += "Orange"                              //> res2: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Apple, Bana
                                                  //| na, Orange)

  val so = new Array[String](3)                   //> so  : Array[String] = Array(null, null, null)
  so(0) = "Some"
  so(2) = "Thing"

  so                                              //> res3: Array[String] = Array(Some, null, Thing)

}