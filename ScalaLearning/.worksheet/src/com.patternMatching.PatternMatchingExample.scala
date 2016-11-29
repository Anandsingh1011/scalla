package com.patternMatching

object PatternMatchingExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(105); 

  var a = 1 :: 2 :: "One" :: "Two" :: Nil;System.out.println("""a  : List[Any] = """ + $show(a ));$skip(11); val res$0 = 

  a.head;System.out.println("""res0: Any = """ + $show(res$0));$skip(39); 

  def dropLi[T](l: List[T]) = l.tail;System.out.println("""dropLi: [T](l: List[T])List[T]""");$skip(13); val res$1 = 


	dropLi(a)
	
	class Covariant[+A];System.out.println("""res1: List[Any] = """ + $show(res$1));$skip(76); 
	
	val cv: Covariant[AnyRef] = new Covariant[String]
	
	//Not compile  val cv1: Covariant[String] = new Covariant[AnyRef]
	class Contravariant[-A];System.out.println("""cv  : com.patternMatching.PatternMatchingExample.Covariant[AnyRef] = """ + $show(cv ));$skip(156); 
	
	val cv2: Contravariant[String] = new Contravariant[AnyRef];System.out.println("""cv2  : com.patternMatching.PatternMatchingExample.Contravariant[String] = """ + $show(cv2 ))}
	
//not compile  val cv3: Contravariant[AnyRef] = new Contravariant[String]
}
