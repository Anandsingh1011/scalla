package com.concurrency

object ConcurrencyExample {

val hello = new Thread(new Runnable {
	def run(){
		println("Hello word Thread..")
	}
})                                                //> hello  : Thread = Thread[Thread-0,5,main]


	
}