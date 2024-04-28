package com.my.threadpools;

public class MessageProcessor implements Runnable {

	private int message;
	
	public MessageProcessor(int message) {
		this.message = message;
	}
	

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +" Received message: " + message);
		respondToMessage();
		System.out.println(Thread.currentThread().getName() + " Done processing message " + message);
	
	}
	
	public void respondToMessage() {
			
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			System.out.println("Unable to process " + message);;
			e.printStackTrace();
		}
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}

	
	
}
