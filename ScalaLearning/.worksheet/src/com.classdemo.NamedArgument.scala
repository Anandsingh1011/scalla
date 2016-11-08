package com.classdemo

object NamedArgument {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(138); 

  def main(args: Array[String]) {

    printName(fName = "Anand", lName = "Singh")

  };System.out.println("""main: (args: Array[String])Unit""");$skip(113); 

  def printName(fName: String = "Unknown", lName: String = "Unknown") {
    println(fName + " , " + lName)
  };System.out.println("""printName: (fName: String, lName: String)Unit""");$skip(48); 

  printName(fName = "Anand", lName = "Singh");$skip(32); 
  
  printName(fName = "Anand");$skip(32); 
  
  printName(lName = "Singh");$skip(24); 
  
  printName("Anand");$skip(17); 
  
  printName()}
}
