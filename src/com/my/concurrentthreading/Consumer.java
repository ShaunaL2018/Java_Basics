package com.my.concurrentthreading;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<Integer> blockingQueue = null;

	public Consumer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
		@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(100); //can slow down or speed up processing by upping/lowering # 100 faster vs. 1000 (1 sec) a bit slower
				System.out.println("The question was Answered " + blockingQueue.take()); //use put and take and not add/remove
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
				
	public BlockingQueue<Integer> getBlockingQueue() {
		return blockingQueue;
	}
	public void setBlockingQueue(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

}
