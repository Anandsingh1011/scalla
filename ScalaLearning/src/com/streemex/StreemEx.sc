package com.streemex

import scala.io.Source
object StreemEx {

  val f = Source.fromFile("c:\\WORK\\test.txt")   //> f  : scala.io.BufferedSource = non-empty iterator

  f.getLines().foreach { println }                //> About
                                                  //| Scala school started as a series of lectures at Twitter to prepare experienc
                                                  //| ed engineers to be productive Scala programmers. Scala is a relatively new l
                                                  //| anguage, but draws on many familiar concepts. Thus, these lectures assumed t
                                                  //| he audience knew the concepts and showed how to use them in Scala. We found 
                                                  //| this an effective way of getting new engineers up to speed quickly. This is 
                                                  //| the written material that accompanied those lectures. We have found that the
                                                  //| se are useful in their own right.
  var li = f.getLines().toList                    //> li  : List[String] = List()

}