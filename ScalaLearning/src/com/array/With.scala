package com.array

object With extends App {
  
  val e = Emp("Anand",123)
  
  print(e)
  
}

case class Emp(name : String, id : Int){
  
  override def toString = s"$name|$id"
}