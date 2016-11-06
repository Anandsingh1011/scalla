package com.match1

object Match {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(400); 

  val month = i match {
    case 1 => "January"
    case 2 => "February"
    case 3 => "March"
    case 4 => "April"
    case 5 => "May"
    case 6 => "June"
    case 7 => "July"
    case 8 => "August"
    case 9 => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    case _ => "Invalid month" // the default, catch-all
  };System.out.println("""month  : String = """ + $show(month ));$skip(13); 

  val i = 1;System.out.println("""i  : Int = """ + $show(i ));$skip(134); 
  val x = (i: @switch) match {
    case 1 => println("One")
    case 2 => println("Two")
    case _ => println("Other")
    
    
  };System.out.println("""x  : Unit = """ + $show(x ))}
}
