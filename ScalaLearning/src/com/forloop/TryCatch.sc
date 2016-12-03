package com.forloop

object TryCatch {

  //---try-catch
  def g(): Int = try { 1 } finally { println("FF") }
                                                  //> g: ()Int

  val a = g()                                     //> FF
                                                  //| a  : Int = 1

  //---Match
  val firstArg = "chips"                          //> firstArg  : String = chips
  firstArg match {
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")
  }                                               //> salsa

  //-- Match
  val firstArg1 = "salt"                          //> firstArg1  : String = salt
  val friend =
    firstArg1 match {
      case "salt" => "pepper"
      case "chips" => "salsa"
      case "eggs" => "bacon"
      case _ => "huh?"
    }                                             //> friend  : String = pepper
  println(friend)                                 //> pepper

  //----break and continue

  def printMultiTable() {
    var i = 1
    // only i in scope here
    while (i <= 10) {
      var j = 1
      // both i and j in scope here
      while (j <= 10) {
        val prod = (i * j).toString
        // i, j, and prod in scope here
        var k = prod.length
        // i, j, prod, and k in scope here
        while (k < 4) {
          print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }
      // i and j still in scope; prod and k out of scope
      println()
      i += 1
    }
    // i still in scope; j, prod, and k out of scope
  }                                               //> printMultiTable: ()Unit
  printMultiTable()                               //>    1   2   3   4   5   6   7   8   9  10
                                                  //|    2   4   6   8  10  12  14  16  18  20
                                                  //|    3   6   9  12  15  18  21  24  27  30
                                                  //|    4   8  12  16  20  24  28  32  36  40
                                                  //|    5  10  15  20  25  30  35  40  45  50
                                                  //|    6  12  18  24  30  36  42  48  54  60
                                                  //|    7  14  21  28  35  42  49  56  63  70
                                                  //|    8  16  24  32  40  48  56  64  72  80
                                                  //|    9  18  27  36  45  54  63  72  81  90
                                                  //|   10  20  30  40  50  60  70  80  90 100
  
  //Code refactoring
  // Returns a row as a sequence
  def makeRowSeq(row: Int) =
    for (
      col <- 1
        to 10
    ) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }                                             //> makeRowSeq: (row: Int)scala.collection.immutable.IndexedSeq[String]
  // Returns a row as a string
  def makeRow(row: Int) = makeRowSeq(row).mkString//> makeRow: (row: Int)String
  // Returns table as a string with one row per line
  def multiTable() = {
    val tableSeq = // a sequence of row strings
      for (row <- 1 to 10)
        yield makeRow(row)
    tableSeq.mkString("\n")
  }                                               //> multiTable: ()String
  multiTable()                                    //> res0: String = "   1   2   3   4   5   6   7   8   9  10
                                                  //|    2   4   6   8  10  12  14  16  18  20
                                                  //|    3   6   9  12  15  18  21  24  27  30
                                                  //|    4   8  12  16  20  24  28  32  36  40
                                                  //|    5  10  15  20  25  30  35  40  45  50
                                                  //|    6  12  18  24  30  36  42  48  54  60
                                                  //|    7  14  21  28  35  42  49  56  63  70
                                                  //|    8  16  24  32  40  48  56  64  72  80
                                                  //|    9  18  27  36  45  54  63  72  81  90
                                                  //|   10  20  30  40  50  60  70  80  90 100"
}