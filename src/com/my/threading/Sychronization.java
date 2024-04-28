package com.my.threading;

public class Sychronization {

	public static void main(String[] args) {
		
		//this alone and by itself would not be thread safe if multiple processing trying to access it
		/*
		 * Sequence mySequence = new Sequence();
		 * 
		 * for (int i=0; i<10; i++) {
		 * 
		 * System.out.println(mySequence.getNext()); }
		 */
		
		Sequence mySequence = new Sequence();
		Worker myWorker = new Worker(mySequence);
				
		myWorker.start();
		
		Worker myWorker2 = new Worker(mySequence);
		myWorker2.start();
		
		//executing the above shows both workers accessing class and sharing resources; not evenly distributed
		

	}

}
