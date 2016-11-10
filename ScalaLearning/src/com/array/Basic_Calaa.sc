package com.array

object Basic_Calaa {

  val a = 10                                      //> a  : Int = 10

  trait Car {
    val brand: String
  }

  class BMW extends Car {
    val brand = "BMW"
  }

  val b = new BMW                                 //> b  : com.array.Basic_Calaa.BMW = com.array.Basic_Calaa$$anonfun$main$1$BMW$1
                                                  //| @36d64342

  trait Cache[K, V] {
    def get(key: K): V
    def put(key: K, value: V)
    def delete(key: K)
  }

  def add(a: Int) = a + 1                         //> add: (a: Int)Int

  //============== Apply =========
  val c = (x: Int) => x + 2                       //> c  : Int => Int = <function1>

  c.toString()                                    //> res0: String = <function1>

  c.apply(2)                                      //> res1: Int = 4

  val d = c.compose { x: Int => x - 1 }           //> d  : Int => Int = <function1>

  d.apply(2)                                      //> res2: Int = 3

  class SomeDo {
    def apply() = println("testing apply")
  }

  val so = new SomeDo                             //> so  : com.array.Basic_Calaa.SomeDo = com.array.Basic_Calaa$$anonfun$main$1$S
                                                  //| omeDo$1@17f6480

  so()                                            //> testing apply

  //Object and class

  // object and claaa can have same name

  class TimeMech(a: Int) {

    def currentTime = a + 10
  }

  object TimeMech {
    def apply(a: Int) = new TimeMech(a)
  }

  val ff = TimeMech(32)                           //> ff  : com.array.Basic_Calaa.TimeMech = com.array.Basic_Calaa$$anonfun$main$1
                                                  //| $TimeMech$2@2d6e8792

  ff.currentTime                                  //> res3: Int = 42

  object Three {
    def addThree(a: Int, b: Int, c: Int) = a + b + c
  }

  Three.addThree(1, 3, 5)                         //> res4: Int = 9

	  class AddOne extends Function1[Int, Int] {
    def apply(m: Int): Int = m + 1
  }

  val plusOne = new AddOne()                      //> plusOne  : com.array.Basic_Calaa.AddOne = <function1>

  plusOne(1)                                      //> res5: Int = 2

  object colorHolder {
    val BLUE = "Blue"
    val RED = "Red"
  }

	println(colorHolder.RED)                  //> Red
}