package com.concurrency

object ConcurrencyExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(142); 

val hello = new Thread(new Runnable {
	def run(){
		println("Hello word Thread..")
	}
});System.out.println("""hello  : Thread = """ + $show(hello ))}


	
}
