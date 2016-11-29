package com.streemex

import scala.io.Source
object StreemEx {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(113); 

  val f = Source.fromFile("c:\\WORK\\test.txt");System.out.println("""f  : scala.io.BufferedSource = """ + $show(f ));$skip(37); 

  f.getLines().foreach { println };$skip(31); 
  var li = f.getLines().toList;System.out.println("""li  : List[String] = """ + $show(li ))}

}
