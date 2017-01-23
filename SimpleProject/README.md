To Run

sbt assembly

spark-submit --class PrintTweets --master local[4] target/scala-2.11/SimpleProject-assembly-1.0.jar 