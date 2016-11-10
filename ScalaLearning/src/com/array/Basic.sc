package com.array

object Basic {

  //Partial application

  def adder(m: Int, n: Int) = m + n               //> adder: (m: Int, n: Int)Int

  def add2 = adder(2, _: Int)                     //> add2: => Int => Int

  add2(3)                                         //> res0: Int = 5

  //Curried functions

  def multiply(m: Int)(n: Int): Int = m * n       //> multiply: (m: Int)(n: Int)Int

  multiply(2)(3)                                  //> res1: Int = 6

  val multiplyLater = multiply(2) _               //> multiplyLater  : Int => Int = <function1>

  multiplyLater(3)                                //> res2: Int = 6

  val curriedAdd = (adder _).curried              //> curriedAdd  : Int => (Int => Int) = <function1>

  val addTwo = curriedAdd(2)                      //> addTwo  : Int => Int = <function1>

  addTwo(4)                                       //> res3: Int = 6

  //Variable length arguments

  def capitalizeAll(args: String*) = {
    args.map { x => x.capitalize }
  }                                               //> capitalizeAll: (args: String*)Seq[String]

  capitalizeAll("anand", "kumar", "singh")        //> res4: Seq[String] = ArrayBuffer(Anand, Kumar, Singh)

  //Constructor

  class Calculator(brand: String) {

    val color: String = if (brand == "TI") {
      "blue"
    } else if (brand == "HP") {
      "black"
    } else {
      "white"
    }

    def add(m: Int, n: Int): Int = m + n

  }

  val cal = new Calculator("HP")                  //> cal  : com.array.Basic.Calculator = com.array.Basic$$anonfun$main$1$Calculat
                                                  //| or$1@67b6d4ae
  cal.color                                       //> res5: String = black

  cal.add(2, 6)                                   //> res6: Int = 8


  //Function and Method

  class C {
    var acc = 0
    def minc = { acc + 1 }
    val finc = { () => acc += 1 }

  }

  val c = new C                                   //> c  : com.array.Basic.C = com.array.Basic$$anonfun$main$1$C$1@34b7bfc0

  c.minc                                          //> res7: Int = 1

  c.finc                                          //> res8: () => Unit = <function0>


 
 

}