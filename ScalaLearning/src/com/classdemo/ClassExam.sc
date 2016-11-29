package com.classdemo

object ClassExam {

  def add(b: Int) = {
    b + 1

  }                                               //> add: (b: Int)Int

  class ChecksumAccumulator {
    private var sum = 0
    def add(b: Byte): Unit = sum += b
    def checksum(): Int = ~(sum & 0xFF) + 1
  }
}