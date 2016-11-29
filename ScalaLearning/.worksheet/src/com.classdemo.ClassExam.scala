package com.classdemo

object ClassExam {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 

  def add(b: Int) = {
    b + 1

  };System.out.println("""add: (b: Int)Int""")}

  class ChecksumAccumulator {
    private var sum = 0
    def add(b: Byte): Unit = sum += b
    def checksum(): Int = ~(sum & 0xFF) + 1
  }
}
