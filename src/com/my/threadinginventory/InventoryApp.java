package com.my.threadinginventory;

public class InventoryApp {

	public static void main(String[] args) {
		
		concurrentArrayListTest();
	}
	
	public static void initialTest() {
		InventoryManager im = new InventoryManager();
		Thread populateThread = new Thread (new Runnable() {			
			@Override
			public void run() {
				im.populateSoldProduct();
			}
		});
		Thread displayThread = new Thread(new Runnable() {			
			@Override
			public void run() {
				im.displaySoldProducts();
			}
		});
		
		populateThread.start();
		
		try {
			Thread.sleep(3000);//this may help with letting each process complete but not guaranteed
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//can also use populateThread.join() to tell other process to hold until populate method done
		/*
		 * try { populateThread.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		//sequential processing only not really multi-threading
		
		displayThread.start(); //without synchronized some records appear to have gotten lost with processing only 1 sold appears on console?
		
	}
	
	public static void concurrentArrayListTest() {
		InventoryManager im = new InventoryManager();
		Thread populateThread = new Thread (new Runnable() {			
			@Override
			public void run() {
				im.populateSoldProduct();
			}
		});
		Thread displayThread = new Thread(new Runnable() {			
			@Override
			public void run() {
				im.displaySoldProducts();
			}
		});
		
		populateThread.start();
		
		try {
			Thread.sleep(8000);//this may help with letting each process complete but not guaranteed
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//can also use populateThread.join() to tell other process to hold until populate method done
		
		  try { populateThread.join();  //forces synchronizes / could also use synchronization
		  } catch (InterruptedException e) { 
			   e.printStackTrace(); 
		  }
		 
		//sequential processing only not really multi-threading
		
		displayThread.start(); //without synchronized some records appear to have gotten lost with processing only 1 sold appears on console?
		
	}
}
