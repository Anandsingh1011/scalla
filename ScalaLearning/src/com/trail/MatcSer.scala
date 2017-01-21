package com.trail

case class MatcSer() extends CalService with ReportServ {

  type EmployeeData = (String, Int, String)
  val dsl = """biweekly {
      federal tax          %f  percent,
      state tax            %f  percent,
      insurance premiums   %f  dollars,
      retirement savings   %f  percent
    }"""

  def readData(inputFileName: String): Seq[(String, Money, String)] =
    for {
      line <- scala.io.Source.fromFile(inputFileName).getLines.toVector
      if line.matches("\\s*#.*") == false // skip comments
    } yield toRule(line)

  def toRule(line: String): (String, Money, String) = { 
    val Array(name, salary, fedTax, stateTax, insurance, retirement) =
      line.split("""\s*,\s*""")

    val ruleString = dsl.format(
      fedTax.toDouble, stateTax.toDouble,
      insurance.toDouble, retirement.toDouble)
    (name, Money(salary.toDouble), ruleString)
  }
  def add(a: Int, b: Int): Int = a + b
  def substrect(a: Int, b: Int) = a - b
}

object MathTest extends App {

  val m = MatcSer()

  //println(m.add(12, 12))
  //println(m.substrect(112, 12))
  //println(m.createReport(""))

  val inputFileName =
    if (args.length > 0) args(0) else "misc/parthenon-payroll.txt"
  val data = m.readData(inputFileName)
  //println(data)
  
  val som ="Anand Kumar Singh"
   val s =  som.split(" ")
      println(s.map { x => x })
}

case class Money(amount: Double) {
  require(amount >= 0.0, s"Negative amount $amount not allowed")

  def +(m: Money): Money = Money(amount + m.amount)
  def -(m: Money): Money = Money(amount - m.amount)
  def >=(m: Money): Boolean = amount >= m.amount

  override def toString = "$" + amount
}

case object Money {
  /**
   * Convenience method to convert a string to Money. Doesn't handle an invalid
   * string!
   */
  def apply(amount: String): Money = Money(amount.toDouble)
}