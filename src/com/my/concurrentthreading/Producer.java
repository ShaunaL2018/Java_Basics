package com.my.concurrentthreading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	BlockingQueue<Integer> blockingQueue = null;
	int questionNo = 0;

	public Producer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
		@Override
	public void run() {
		
		while (true) {
		//synchronized (blockingQueue) {
		
			questionNo++; //3 steps in 1
			
			try {
				synchronized (this) { //next synchronizations are a red flag will decrease performance
					int nextQuestion = questionNo;
					System.out.println("Next Question is: " + nextQuestion);
					blockingQueue.put(nextQuestion); //this here is not 100% thread safe
				}
		     } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//}
		}
	}
		
//	private int getNextQuestion() { //this method is thread safe even with synchronized
//		int nextQuestion = questionNo;
//		System.out.println("Next Question is: " + nextQuestion);
//		return nextQuestion;
//	}
		
		
	public BlockingQueue<Integer> getBlockingQueue() {
		return blockingQueue;
	}
	public void setBlockingQueue(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
	
	

}
