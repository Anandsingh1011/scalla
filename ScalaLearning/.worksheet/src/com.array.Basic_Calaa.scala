package com.array

object Basic_Calaa {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 

  val a = 10

  trait Car {
    val brand: String
  }

  class BMW extends Car {
    val brand = "BMW"
  };System.out.println("""a  : Int = """ + $show(a ));$skip(116); 

  val b = new BMW

  trait Cache[K, V] {
    def get(key: K): V
    def put(key: K, value: V)
    def delete(key: K)
  };System.out.println("""b  : com.array.Basic_Calaa.BMW = """ + $show(b ));$skip(132); 

  def add(a: Int) = a + 1;System.out.println("""add: (a: Int)Int""");$skip(65); 

  //============== Apply =========
  val c = (x: Int) => x + 2;System.out.println("""c  : Int => Int = """ + $show(c ));$skip(17); val res$0 = 

  c.toString();System.out.println("""res0: String = """ + $show(res$0));$skip(15); val res$1 = 

  c.apply(2);System.out.println("""res1: Int = """ + $show(res$1));$skip(42); 

  val d = c.compose { x: Int => x - 1 };System.out.println("""d  : Int => Int = """ + $show(d ));$skip(15); val res$2 = 

  d.apply(2)

  class SomeDo {
    def apply() = println("testing apply")
  };System.out.println("""res2: Int = """ + $show(res$2));$skip(90); 

  val so = new SomeDo;System.out.println("""so  : com.array.Basic_Calaa.SomeDo = """ + $show(so ));$skip(9); 

  so()

  //Object and class

  // object and claaa can have same name

  class TimeMech(a: Int) {

    def currentTime = a + 10
  }

  object TimeMech {
    def apply(a: Int) = new TimeMech(a)
  };$skip(222); 

  val ff = TimeMech(32);System.out.println("""ff  : com.array.Basic_Calaa.TimeMech = """ + $show(ff ));$skip(19); val res$3 = 

  ff.currentTime

  object Three {
    def addThree(a: Int, b: Int, c: Int) = a + b + c
  };System.out.println("""res3: Int = """ + $show(res$3));$skip(104); val res$4 = 

  Three.addThree(1, 3, 5)

	  class AddOne extends Function1[Int, Int] {
    def apply(m: Int): Int = m + 1
  };System.out.println("""res4: Int = """ + $show(res$4));$skip(118); 

  val plusOne = new AddOne();System.out.println("""plusOne  : com.array.Basic_Calaa.AddOne = """ + $show(plusOne ));$skip(15); val res$5 = 

  plusOne(1)

  object colorHolder {
    val BLUE = "Blue"
    val RED = "Red"
  };System.out.println("""res5: Int = """ + $show(res$5));$skip(98); 

	println(colorHolder.RED)}
}
