package com.array

object StackExample {

  trait Stack[T] {
    def push(itrm: T): Unit
    def pop()
    //val size
  }

  class StackImpl[T] extends Stack[T] {
		val elements = List[T]()
		
    def isEmpty(): Boolean = { size == 0 }
    def push(itrm: T): Unit = {
    
    elements+itrm
    size = size + 1
    
    }
    def pop() = {}
    var size = 0
  }

  val st = new StackImpl[String]
	st.isEmpty()
  st.push("12")
  st.isEmpty()
}