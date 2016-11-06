package com.datetime

import java.util.Calendar

import java.text.SimpleDateFormat

object DateTimeExample {

  val now = Calendar.getInstance()                //> now  : java.util.Calendar = java.util.GregorianCalendar[time=1478382342604,a
                                                  //| reFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.Zo
                                                  //| neInfo[id="America/Los_Angeles",offset=-28800000,dstSavings=3600000,useDayli
                                                  //| ght=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_An
                                                  //| geles,offset=-28800000,dstSavings=3600000,useDaylight=true,startYear=0,start
                                                  //| Mode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeM
                                                  //| ode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeM
                                                  //| ode=0]],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2016,MONTH=10,W
                                                  //| EEK_OF_YEAR=45,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=310,DAY_OF_WEEK=7,
                                                  //| DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=45,SECOND=42,MIL
                                                  //| LISECOND=604,ZONE_OFFSET=-28800000,DST_OFFSET=3600000]
  val currentHour = now.get(Calendar.HOUR_OF_DAY) //> currentHour  : Int = 14

  val minuteFormat = new SimpleDateFormat("mm")   //> minuteFormat  : java.text.SimpleDateFormat = java.text.SimpleDateFormat@da0
                                                  //| 
  val currentMinuteAsString = minuteFormat.format(now)
                                                  //> java.lang.IllegalArgumentException: Cannot format given Object as a Date
                                                  //| 	at java.text.DateFormat.format(DateFormat.java:301)
                                                  //| 	at java.text.Format.format(Format.java:157)
                                                  //| 	at com.datetime.DateTimeExample$$anonfun$main$1.apply$mcV$sp(com.datetim
                                                  //| e.DateTimeExample.scala:13)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at com.datetime.DateTimeExample$.main(com.datetime.DateTimeExample.scala
                                                  //| :7)
                                                  //| 	at com.datetime.DateTimeExample.main(com.datetime.DateTimeExample.scala)
                                                  //| 

val today = Calendar.getInstance().getTime()
    
// create the date/time formatters
val hourFormat = new SimpleDateFormat("hh")
val amPmFormat = new SimpleDateFormat("a")

val currentMinute = minuteFormat.format(today)  // 29
val amOrPm = amPmFormat.format(today)
}