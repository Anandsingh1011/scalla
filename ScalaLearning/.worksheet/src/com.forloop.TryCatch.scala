package com.forloop

object TryCatch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(111); 

  //---try-catch
  def g(): Int = try { 1 } finally { println("FF") };System.out.println("""g: ()Int""");$skip(16); 

  val a = g();System.out.println("""a  : Int = """ + $show(a ));$skip(40); 

  //---Match
  val firstArg = "chips";System.out.println("""firstArg  : String = """ + $show(firstArg ));$skip(163); 
  firstArg match {
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")
  };$skip(40); 

  //-- Match
  val firstArg1 = "salt";System.out.println("""firstArg1  : String = """ + $show(firstArg1 ));$skip(155); 
  val friend =
    firstArg1 match {
      case "salt" => "pepper"
      case "chips" => "salsa"
      case "eggs" => "bacon"
      case _ => "huh?"
    };System.out.println("""friend  : String = """ + $show(friend ));$skip(18); 
  println(friend);$skip(608); 

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
  };System.out.println("""printMultiTable: ()Unit""");$skip(20); 
  printMultiTable();$skip(249); 
  
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
    };System.out.println("""makeRowSeq: (row: Int)scala.collection.immutable.IndexedSeq[String]""");$skip(82); 
  // Returns a row as a string
  def makeRow(row: Int) = makeRowSeq(row).mkString;System.out.println("""makeRow: (row: Int)String""");$skip(210); 
  // Returns table as a string with one row per line
  def multiTable() = {
    val tableSeq = // a sequence of row strings
      for (row <- 1 to 10)
        yield makeRow(row)
    tableSeq.mkString("\n")
  };System.out.println("""multiTable: ()String""");$skip(15); val res$0 = 
  multiTable();System.out.println("""res0: String = """ + $show(res$0))}
}
