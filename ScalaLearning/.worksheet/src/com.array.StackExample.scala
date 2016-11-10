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
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(400); 

  val st = new StackImpl[String];System.out.println("""st  : com.array.StackExample.StackImpl[String] = """ + $show(st ));$skip(14); val res$0 = 
	st.isEmpty();System.out.println("""res0: Boolean = """ + $show(res$0));$skip(16); 
  st.push("12");$skip(15); val res$1 = 
  st.isEmpty();System.out.println("""res1: Boolean = """ + $show(res$1))}
}
