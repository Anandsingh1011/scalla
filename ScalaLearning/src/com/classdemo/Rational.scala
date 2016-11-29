package com.classdemo

class Rational(n: Int, d: Int) {

  require(d != 0)

  def this(n: Int) = this(n, 1)

  //println("Creating Obj..")
  private val g = gcd(n.abs, d.abs)
  val num = n / g
  val den = d / g

  override def toString = num + "/" + den

  def +(that: Rational): Rational =
    new Rational(num * that.den + that.num * den, den * that.den)

  def +(i: Int): Rational =
    new Rational(num + i * den, den)

  def -(that: Rational): Rational =
    new Rational(num * that.den - that.num * den, den * that.den)

  def -(i: Int): Rational =
    new Rational(num - i * den, den)

  def *(that: Rational): Rational =
    new Rational(num * that.num, den * that.den)

  def *(i: Int): Rational =
    new Rational(num * i, den)

  def /(that: Rational): Rational = new Rational(this.num * that.den, this.den * that.num)

  def /(i: Int): Rational =
    new Rational(num, den * i)

  def <(that: Rational) = this.num * that.den < this.den * that.num

  def >(that: Rational) = this.num * that.den > this.den * that.num

  def max(that: Rational) = if (this < that) that else this

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

object AppRun {

  def main(args: Array[String]): Unit = {
    val r = new Rational(1, 2)
    val s = new Rational(2, 3)

    println(r + s)

    println(r / 4)
    
    println(r - s)

    println(r * s)

    println(r / s)

    println(r < s)

    println(r > s)

    println(r max s)

    val t = new Rational(5)

    println(t)

    val q = new Rational(66, 42)

    println(q)

  }
}