

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
//to run :: 
//spark-submit --class SimpleApp --master local[4]  target/scala-2.11/simple-project_2.11-1.0.jar
object SimpleApp {
  def main(args: Array[String]) {
    val logFile = "/usr/local/Cellar/apache-spark/2.1.0/README.md" // Should be some file on your system
    val conf = new SparkConf().setAppName("Simple Application")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    sc.stop()
  }
}