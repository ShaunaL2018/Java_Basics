package com.my.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ConsumerProduceApp {

	public static void main(String[] args) {
		
		List<Integer> questions = new ArrayList<>();
		
		/*
		 * Thread t1 = new Thread(new Producer(questions)); Thread t2 = new Thread(new
		 * Consumer(questions));
		 * 
		 * t1.start(); t2.start();
		 */
		
		//two threads working on processing with wait and notify pattern (Producer/Consumer patter)
	
		//DOES THE SAME THING AS THE CODE ABOVE - .start is embedded
		Executor exec = Executors.newFixedThreadPool(2);
		exec.execute(new Producer(questions));
		exec.execute(new Consumer(questions));
	}

}
