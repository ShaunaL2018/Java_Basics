package com.my.threading;

public class Worker extends Thread {
	
	Sequence sequence = null;
	
	public Worker (Sequence sequence) {
		this.sequence = sequence;
	}
	
	//synchronized this(Thread thread){
		@Override
		public synchronized void run() {
			super.run();
			for (int i=0; i<10; i++) {
				System.out.println(currentThread().getName() + " value: " + sequence.getNext());
//No need to force wait as the synchronized call will force one by one eating
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					 e.printStackTrace();
//				}
				//System.out.println(mySequence.getNext());
			}
		}
	//}

	public Sequence getSequence() {
		return sequence;
	}

	public void setSequence(Sequence sequence) {
		this.sequence = sequence;
	}
	
	

}
