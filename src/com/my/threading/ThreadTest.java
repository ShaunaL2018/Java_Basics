package com.my.threading;

public class ThreadTest {

	public static void main (String[] args) {
	
		//threadClassExample();
		runClassExample3();
	}
	public static void runClassExample() {
		
		
		//Using Runnable interface does NOT make multi-threaded still single threaded****
		//we need to execute the start
		System.out.println("Starting Thread 1");
		
		System.out.println("Starting Thread X");		
		Thread newThread = new Thread();
		RunExample thread = new RunExample(newThread, "Thread X");
			
		System.out.println("Starting Thread Y");		
		Thread newThread2 = new Thread();
		RunExample thread2 = new RunExample(newThread2, "Thread Y");
		
		System.out.println("Starting Thread Z");		
		Thread newThread3 = new Thread();
		RunExample thread3 = new RunExample(newThread3, "Thread Z");
		
		thread.run();
		thread2.run();
		thread3.run();
		
		System.out.println("Threads: " + thread.getThreadName() +" and " + thread2.getThreadName() +
		" and " + thread3.getThreadName() +" has completed");
		
	}
	
public static void runClassExample2() {
		
		
		//Using Runnable interface does NOT make multi-threaded still single threaded****
		//we need to execute the start
		System.out.println("Starting Thread 1");
		
		System.out.println("Starting Thread X");		
		Thread newThread = new Thread(new Task("Thread X")); //can do short cut here
		newThread.start();
			
		System.out.println("Starting Thread Y");		
		Task myThread2 = new Task("Thread Y");
		Thread newThread2 = new Thread(myThread2);
		newThread2.start();
		
		System.out.println("Starting Thread Z");		
		Task myThread3 = new Task("Thread Z");
		Thread newThread3 = new Thread(myThread3);
		newThread3.start();
		
		//still not working as desired - hits the system out before completion
		//myThread.sleep(); - my thread reference is now gone; see above
		myThread2.sleep();
		myThread3.sleep();
				
		//forcing a wait as expected :-)
		System.out.println("Threads: " + newThread.getName() +" and " + newThread2.getName() +
		" and " + newThread3.getName() +" has completed - maybe");
		
		
		
	}

public static void runClassExample3() {
	
	//Using Runnable interface does NOT make multi-threaded still single threaded****
	//we need to execute the start
	System.out.println("Starting Thread 1");
	
	System.out.println("Starting Thread 2");		
	
	Thread newThread = new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			for (int i=0; i<50; i++) {
				System.out.println("number: " + i);
				try {
					Thread.sleep(10); //forces a wait
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	});
	
	newThread.start();
	System.out.println(newThread.getName());
}

	public static void threadClassExample() {
		//1st Thread - each line would execute one by one
		//System.out.println("Hello There");
		System.out.println("Starting Thread 1");
		
		//Thread a = new Thread("a"); //setting 1st thread to 'a'
		 //better to do this
 		Task taskRunner = new Task("A");
 		taskRunner.start(); //tells program you don't have to wait
 		//thread was spawning and line below printed 
		
 		//move this here - will not wait for code above to complete 
 		//will execute simultaneously
 		System.out.println("Starting Thread 2");
		
 		//Thread b = new Thread("b"); //setting 2nd thread to 'b'
 		//can't start same thread more than once; ;create new
 		Task taskRunner2 = new Task("B");
 		taskRunner2.start(); //tells program you don't have to wait
 		
 		//can review sysout and see different threads intermingled
	}
}
	
	class Task extends Thread {
		
		//Thread incoming = null;
		String tName = null;
		
		public Task(String name) {
			
			this.tName = name;
		}
	
		@Override
		public void run() {
			
			currentThread().setName(tName);
			for (int i=0; i<50; i++) {
				System.out.println("number: " + i + " " + currentThread().getName());
				try {
					Thread.sleep(10); //forces a wait
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//can also set the name of the thread to something you prefer
			}
		}
		
		public void sleep() {
			try {
				currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		public String gettName() {
			return tName;
		}

		public void settName(String tName) {
			this.tName = tName;
		}

//		public Thread getIncoming() {
//			return incoming;
//		}
//
//		public void setIncoming(Thread incoming) {
//			this.incoming = incoming;
//		}
	}
	
	class RunExample implements Runnable{

		Thread myThread = null;
		String threadName = null;
		
		public RunExample(Thread myThread, String threadName) {
			this.myThread = myThread;
			this.threadName = threadName;
		}
		
		@Override
		public void run() {
			myThread.setName(threadName);
			
			for (int i=0; i<1000; i++) {
				System.out.println(myThread.getName() + " is running....");
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//myThread.run();
			
		}
		
		public void sleep() {
			
			try {
				myThread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}

		public Thread getMyThread() {
			return myThread;
		}

		public void setMyThread(Thread myThread) {
			this.myThread = myThread;
		}

		public String getThreadName() {
			return threadName;
		}

		public void setThreadName(String threadName) {
			this.threadName = threadName;
		}	
		
	}
	
	
	
	
	

