package com.forloop

object ForLoop {

  for (i <- 1 to 10) yield i                      //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
  for (i <- 1 to 5) yield i * 2                   //> res1: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10)

  val a = Array(1, 2, 3, 4, 5, 6)                 //> a  : Array[Int] = Array(1, 2, 3, 4, 5, 6)

  for (i <- a) yield i                            //> res2: Array[Int] = Array(1, 2, 3, 4, 5, 6)

  for (i <- a if i > 3) yield i                   //> res3: Array[Int] = Array(4, 5, 6)
  for (i <- a if i > 3) yield i * 2               //> res4: Array[Int] = Array(8, 10, 12)

  def someMethod = for (i <- a if i > 3) yield i  //> someMethod: => Array[Int]

  someMethod                                      //> res5: Array[Int] = Array(4, 5, 6)

  def someMethod1(aa: Array[Int]) = { for (i <- aa if i > 3) yield i }
                                                  //> someMethod1: (aa: Array[Int])Array[Int]

  someMethod1(a)                                  //> res6: Array[Int] = Array(4, 5, 6)

  def add = {}                                    //> add: => Unit

  var li = List(22, 13, 4, 15, 16, 7)             //> li  : List[Int] = List(22, 13, 4, 15, 16, 7)

  var reverseList = li.reverse                    //> reverseList  : List[Int] = List(7, 16, 15, 4, 13, 22)

  li.sortBy { x => x }                            //> res7: List[Int] = List(4, 7, 13, 15, 16, 22)

  li.drop(2).take(3)                              //> res8: List[Int] = List(4, 15, 16)

  li.foreach { x => println(x) }                  //> 22
                                                  //| 13
                                                  //| 4
                                                  //| 15
                                                  //| 16
                                                  //| 7

  /*----------------------------*/
  val filesHere = (new java.io.File(".")).listFiles
                                                  //> filesHere  : Array[java.io.File] = Array(.\.eclipseproduct, .\artifacts.xml,
                                                  //|  .\configuration, .\dropins, .\eclipsec.exe, .\features, .\hs_err_pid11872.l
                                                  //| og, .\license.txt, .\META-INF, .\open_source_licenses.txt, .\p2, .\plugins, 
                                                  //| .\readme, .\STS.exe, .\STS.ini)

  for (i <- 1 until 4)
    println("Iteration " + i)                     //> Iteration 1
                                                  //| Iteration 2
                                                  //| Iteration 3

  for (i <- 0 to filesHere.length - 1)
    println(filesHere(i))                         //> .\.eclipseproduct
                                                  //| .\artifacts.xml
                                                  //| .\configuration
                                                  //| .\dropins
                                                  //| .\eclipsec.exe
                                                  //| .\features
                                                  //| .\hs_err_pid11872.log
                                                  //| .\license.txt
                                                  //| .\META-INF
                                                  //| .\open_source_licenses.txt
                                                  //| .\p2
                                                  //| .\plugins
                                                  //| .\readme
                                                  //| .\STS.exe
                                                  //| .\STS.ini

  for (
    file <- filesHere if file.getName.endsWith(".log")
  ) println(file)                                 //> .\hs_err_pid11872.log

  for (
    file <- filesHere if file.isFile() if file.getName.endsWith(".log")
  ) println(file)                                 //> .\hs_err_pid11872.log

  //////////////////////////

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file.toString())("UTF-8").getLines().toList
                                                  //> fileLines: (file: java.io.File)List[String]
  val lines12 = scala.io.Source.fromFile("license.txt")("UTF-8")
                                                  //> lines12  : scala.io.BufferedSource = non-empty iterator
  for (line <- lines12) {
    print(line)                                   //> Eclipse Public License - v 1.0
                                                  //| 
                                                  //| THE ACCOMPANYING PROGRAM IS PROVIDED UNDER THE TERMS OF THIS ECLIPSE PUBLIC
                                                  //|  LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THE PROGRA
                                                  //| M CONSTITUTES RECIPIENT'S ACCEPTANCE OF THIS AGREEMENT.
                                                  //| 
                                                  //| 1. DEFINITIONS
                                                  //| 
                                                  //| "Contribution" means:
                                                  //| 
                                                  //| a) in the case of the initial Contributor, the initial code and documentati
                                                  //| on distributed under this Agreement, and
                                                  //| b) in the case of each subsequent Contributor:
                                                  //| i) changes to the Program, and
                                                  //| ii) additions to the Program;
                                                  //| where such changes and/or additions to the Program originate from and are d
                                                  //| istributed by that particular Contributor. A Contribution 'originates' from
                                                  //|  a Contributor if it was added to the Program by such Contributor itself or
                                                  //|  anyone acting on such Contributor's behalf. Contributions do not include a
                                                  //| dditions to the Program which: (i) are separate modules of software distrib
  }
  for (line <- fileLines(filesHere(1))) {
    print(line)                                   //> <?xml version='1.0' encoding='UTF-8'?><?artifactRepository version='1.1.0'?
                                                  //| ><repository name='Bundle pool' type='org.eclipse.equinox.p2.artifact.repos
                                                  //| itory.simpleRepository' version='1.0.0'>  <properties size='2'>    <propert
                                                  //| y name='p2.system' value='true'/>    <property name='p2.timestamp' value='1
                                                  //| 478716689858'/>  </properties>  <mappings size='3'>    <rule filter='(&amp;
                                                  //|  (classifier=osgi.bundle))' output='${repoUrl}/plugins/${id}_${version}.jar
                                                  //| '/>    <rule filter='(&amp; (classifier=binary))' output='${repoUrl}/binary
                                                  //| /${id}_${version}'/>    <rule filter='(&amp; (classifier=org.eclipse.update
                                                  //| .feature))' output='${repoUrl}/features/${id}_${version}.jar'/>  </mappings
                                                  //| >  <artifacts size='1349'>    <artifact classifier='osgi.bundle' id='org.sp
                                                  //| ringframework.ide.eclipse.boot' version='3.8.2.201610040608-RELEASE'>      
                                                  //| <properties size='1'>        <property name='download.size' value='205773'/
                                                  //| >      </properties>   
                                                  //| Output exceeds cutoff limit.
  }

  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".log")
    } yield file                                  //> scalaFiles: => Array[java.io.File]

  scalaFiles.foreach { x => println }             //> 

  val forLineLengths =
    for {
      file <- filesHere
      if file.getName.endsWith(".txt")
      line <- fileLines(
        file)
      trimmed = line.trim
      if trimmed.matches(".*Licensed.*")
    } yield trimmed.length                        //> java.nio.charset.MalformedInputException: Input length = 1
                                                  //| 	at java.nio.charset.CoderResult.throwException(CoderResult.java:281)
                                                  //| 	at sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:339)
                                                  //| 	at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:178)
                                                  //| 	at java.io.InputStreamReader.read(InputStreamReader.java:184)
                                                  //| 	at java.io.BufferedReader.fill(BufferedReader.java:161)
                                                  //| 	at java.io.BufferedReader.readLine(BufferedReader.java:324)
                                                  //| 	at java.io.BufferedReader.readLine(BufferedReader.java:389)
                                                  //| 	at scala.io.BufferedSource$BufferedLineIterator.hasNext(BufferedSource.s
                                                  //| cala:72)
                                                  //| 	at scala.collection.Iterator$class.foreach(Iterator.scala:893)
                                                  //| 	at scala.collection.AbstractIterator.foreach(Iterator.scala:1336)
                                                  //| 	at scala.collection.generic.Growable$class.$plus$plus$eq(Growable.scala:
                                                  //| 59)
                                                  //| 	at scala.collection.mutable.ListBuffer.$plus$plus$eq(ListBuffer.scala:18
                                                  //| 3)
                                                  //| 	at scala.collection.mutable.ListBuffer.$p
                                                  //| Output exceeds cutoff limit.

  def grep(pattern: String) =
    for (
      file <- filesHere if file.getName.endsWith(".txt");
      line <- fileLines(file) if line.trim.matches(pattern)
    ) println(file + ": " + line.trim)

  grep(".*gdc")
}