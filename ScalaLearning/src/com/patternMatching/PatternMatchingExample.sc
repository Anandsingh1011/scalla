package com.patternMatching

object PatternMatchingExample {

  var a = 1 :: 2 :: "One" :: "Two" :: Nil         //> a  : List[Any] = List(1, 2, One, Two)

  a.head                                          //> res0: Any = 1

  def dropLi[T](l: List[T]) = l.tail              //> dropLi: [T](l: List[T])List[T]


	dropLi(a)                                 //> res1: List[Any] = List(2, One, Two)
	
	class Covariant[+A]
	
	val cv: Covariant[AnyRef] = new Covariant[String]
                                                  //> cv  : com.patternMatching.PatternMatchingExample.Covariant[AnyRef] = com.pat
                                                  //| ternMatching.PatternMatchingExample$$anonfun$main$1$Covariant$1@2d6e8792
	
	//Not compile  val cv1: Covariant[String] = new Covariant[AnyRef]
	class Contravariant[-A]
	
	val cv2: Contravariant[String] = new Contravariant[AnyRef]
                                                  //> cv2  : com.patternMatching.PatternMatchingExample.Contravariant[String] = co
                                                  //| m.patternMatching.PatternMatchingExample$$anonfun$main$1$Contravariant$1@281
                                                  //| 2cbfa
	
//not compile  val cv3: Contravariant[AnyRef] = new Contravariant[String]
}