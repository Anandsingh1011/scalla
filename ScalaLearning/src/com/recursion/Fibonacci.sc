package com.recursion
/**
 * Calculating a Fibonacci sequence recursively using Scala.
 */
object Fibonacci  {

    println(fib(1, 2))                            //> 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
                                                  //| 55
                                                  //| 89
                                                  //| 144
                                                  //| 233
                                                  //| 377
                                                  //| 610
                                                  //| 987
                                                  //| 1597
                                                  //| 2584
                                                  //| 4181
                                                  //| 6765
                                                  //| 10946
                                                  //| 17711
                                                  //| 28657
                                                  //| 46368
                                                  //| 75025
                                                  //| 121393
                                                  //| 196418
                                                  //| 317811
                                                  //| 514229
                                                  //| 832040
                                                  //| 1346269
  
    def fib(prevPrev: Int, prev: Int) {
        val next = prevPrev + prev
        println(next)
        if (next > 1000000) System.exit(0)
        fib(prev, next)
    }

}