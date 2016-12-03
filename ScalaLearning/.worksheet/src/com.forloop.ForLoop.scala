package com.forloop

object ForLoop {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); val res$0 = 

  for (i <- 1 to 10) yield i;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$0));$skip(32); val res$1 = 
  for (i <- 1 to 5) yield i * 2;System.out.println("""res1: scala.collection.immutable.IndexedSeq[Int] = """ + $show(res$1));$skip(36); 

  val a = Array(1, 2, 3, 4, 5, 6);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(25); val res$2 = 

  for (i <- a) yield i;System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(34); val res$3 = 

  for (i <- a if i > 3) yield i;System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(36); val res$4 = 
  for (i <- a if i > 3) yield i * 2;System.out.println("""res4: Array[Int] = """ + $show(res$4));$skip(51); 

  def someMethod = for (i <- a if i > 3) yield i;System.out.println("""someMethod: => Array[Int]""");$skip(15); val res$5 = 

  someMethod;System.out.println("""res5: Array[Int] = """ + $show(res$5));$skip(73); 

  def someMethod1(aa: Array[Int]) = { for (i <- aa if i > 3) yield i };System.out.println("""someMethod1: (aa: Array[Int])Array[Int]""");$skip(19); val res$6 = 

  someMethod1(a);System.out.println("""res6: Array[Int] = """ + $show(res$6));$skip(17); 

  def add = {};System.out.println("""add: => Unit""");$skip(40); 

  var li = List(22, 13, 4, 15, 16, 7);System.out.println("""li  : List[Int] = """ + $show(li ));$skip(33); 

  var reverseList = li.reverse;System.out.println("""reverseList  : List[Int] = """ + $show(reverseList ));$skip(25); val res$7 = 

  li.sortBy { x => x };System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(23); val res$8 = 

  li.drop(2).take(3);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(35); 

  li.foreach { x => println(x) };$skip(89); 

  /*----------------------------*/
  val filesHere = (new java.io.File(".")).listFiles;System.out.println("""filesHere  : Array[java.io.File] = """ + $show(filesHere ));$skip(55); 

  for (i <- 1 until 4)
    println("Iteration " + i);$skip(67); 

  for (i <- 0 to filesHere.length - 1)
    println(filesHere(i));$skip(83); 

  for (
    file <- filesHere if file.getName.endsWith(".log")
  ) println(file);$skip(100); 

  for (
    file <- filesHere if file.isFile() if file.getName.endsWith(".log")
  ) println(file);$skip(144); 

  //////////////////////////

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file.toString())("UTF-8").getLines().toList;System.out.println("""fileLines: (file: java.io.File)List[String]""");$skip(65); 
  val lines12 = scala.io.Source.fromFile("license.txt")("UTF-8");System.out.println("""lines12  : scala.io.BufferedSource = """ + $show(lines12 ));$skip(42); 
  for (line <- lines12) {
    print(line)
  };$skip(66); 
 
 
  for (line <- fileLines(filesHere(1))) {
    print(line)
  };$skip(115); 

  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".log")
    } yield file;System.out.println("""scalaFiles: => Array[java.io.File]""");$skip(40); 

  scalaFiles.foreach { x => println };$skip(231); 

  val forLineLengths =
    for {
      file <- filesHere
      if file.getName.endsWith(".txt")
      line <- fileLines(
        file)
      trimmed = line.trim
      if trimmed.matches(".*Licensed.*")
    } yield trimmed.length;System.out.println("""forLineLengths  : Array[Int] = """ + $show(forLineLengths ));$skip(199); 

  def grep(pattern: String) =
    for (
      file <- filesHere if file.getName.endsWith(".txt");
      line <- fileLines(file) if line.trim.matches(pattern)
    ) println(file + ": " + line.trim);System.out.println("""grep: (pattern: String)Unit""");$skip(18); 

  grep(".*gdc")}
}
