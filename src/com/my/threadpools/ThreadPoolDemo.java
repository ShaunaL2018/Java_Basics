package com.my.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService eService = Executors.newFixedThreadPool(3);
		//eService.submit(new MessageProcessor(6));
		
		Runnable processor1 = new MessageProcessor(2);
		eService.execute(processor1);
		Runnable processor2 = new MessageProcessor(4);
		eService.execute(processor2);
		Runnable processor3 = new MessageProcessor(8);
		eService.execute(processor3);
		Runnable processor4 = new MessageProcessor(2);
		eService.execute(processor4);
		Runnable processor5 = new MessageProcessor(1);
		eService.execute(processor5);
		
		eService.shutdown(); //this is needed
		// eService.shutdownNow(); //shuts down service immediately
		
		//while (!eService.isTerminated()) {
			
		//} //this helps with giving time to for completion
		try {//wait 10 seconds before moving on
			eService.awaitTermination(100, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All task have completed");
		
	}
}