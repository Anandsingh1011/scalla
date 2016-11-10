package com.array

object Basic {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(98); 

  //Partial application

  def adder(m: Int, n: Int) = m + n;System.out.println("""adder: (m: Int, n: Int)Int""");$skip(32); 

  def add2 = adder(2, _: Int);System.out.println("""add2: => Int => Int""");$skip(12); val res$0 = 

  add2(3);System.out.println("""res0: Int = """ + $show(res$0));$skip(70); 

  //Curried functions

  def multiply(m: Int)(n: Int): Int = m * n;System.out.println("""multiply: (m: Int)(n: Int)Int""");$skip(19); val res$1 = 

  multiply(2)(3);System.out.println("""res1: Int = """ + $show(res$1));$skip(38); 

  val multiplyLater = multiply(2) _;System.out.println("""multiplyLater  : Int => Int = """ + $show(multiplyLater ));$skip(21); val res$2 = 

  multiplyLater(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(39); 

  val curriedAdd = (adder _).curried;System.out.println("""curriedAdd  : Int => (Int => Int) = """ + $show(curriedAdd ));$skip(31); 

  val addTwo = curriedAdd(2);System.out.println("""addTwo  : Int => Int = """ + $show(addTwo ));$skip(14); val res$3 = 

  addTwo(4);System.out.println("""res3: Int = """ + $show(res$3));$skip(112); 

  //Variable length arguments

  def capitalizeAll(args: String*) = {
    args.map { x => x.capitalize }
  };System.out.println("""capitalizeAll: (args: String*)Seq[String]""");$skip(45); val res$4 = 

  capitalizeAll("anand", "kumar", "singh")

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

  };System.out.println("""res4: Seq[String] = """ + $show(res$4));$skip(279); 

  val cal = new Calculator("HP");System.out.println("""cal  : com.array.Basic.Calculator = """ + $show(cal ));$skip(12); val res$5 = 
  cal.color;System.out.println("""res5: String = """ + $show(res$5));$skip(18); val res$6 = 

  cal.add(2, 6)


  //Function and Method

  class C {
    var acc = 0
    def minc = { acc + 1 }
    val finc = { () => acc += 1 }

  };System.out.println("""res6: Int = """ + $show(res$6));$skip(142); 

  val c = new C;System.out.println("""c  : com.array.Basic.C = """ + $show(c ));$skip(11); val res$7 = 

  c.minc;System.out.println("""res7: Int = """ + $show(res$7));$skip(11); val res$8 = 

  c.finc;System.out.println("""res8: () => Unit = """ + $show(res$8))}


 
 

}
