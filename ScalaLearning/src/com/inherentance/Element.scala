package com.inherentance

object ElementTest extends App {

  val ae = new ArrayElement
  ae.demo()

  val le = new LineElement
  le.demo()

  val e: Element = new ArrayElement
  e.demo()

}

abstract class Element {

  def demo() {
    println("In Element")
  }
}

class ArrayElement extends Element {
  override def demo {
    println("In ArrayElement ")
  }

}

class LineElement extends ArrayElement {
  override def demo() {
    println("In LineItem")
  }
}