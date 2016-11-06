package com.datetime

import java.util.Calendar

import java.text.SimpleDateFormat

object DateTimeExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(148); 

  val now = Calendar.getInstance();System.out.println("""now  : java.util.Calendar = """ + $show(now ));$skip(50); 
  val currentHour = now.get(Calendar.HOUR_OF_DAY);System.out.println("""currentHour  : Int = """ + $show(currentHour ));$skip(50); 

  val minuteFormat = new SimpleDateFormat("mm");System.out.println("""minuteFormat  : java.text.SimpleDateFormat = """ + $show(minuteFormat ));$skip(55); 
  val currentMinuteAsString = minuteFormat.format(now);System.out.println("""currentMinuteAsString  : String = """ + $show(currentMinuteAsString ));$skip(46); 

val today = Calendar.getInstance().getTime();System.out.println("""today  : java.util.Date = """ + $show(today ));$skip(84); 
    
// create the date/time formatters
val hourFormat = new SimpleDateFormat("hh");System.out.println("""hourFormat  : java.text.SimpleDateFormat = """ + $show(hourFormat ));$skip(43); 
val amPmFormat = new SimpleDateFormat("a");System.out.println("""amPmFormat  : java.text.SimpleDateFormat = """ + $show(amPmFormat ));$skip(55); 

val currentMinute = minuteFormat.format(today);System.out.println("""currentMinute  : String = """ + $show(currentMinute ));$skip(38);   // 29
val amOrPm = amPmFormat.format(today);System.out.println("""amOrPm  : String = """ + $show(amOrPm ))}
}
