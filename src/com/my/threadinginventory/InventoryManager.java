package com.my.threadinginventory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
	
	//List<Product> soldProducts = new ArrayList<>();
	//List<Product> purchasedProducts = new ArrayList<>();
	List<Product> soldProducts = new CopyOnWriteArrayList<>();
	List<Product> purchasedProducts = new CopyOnWriteArrayList<>();
	
	public void populateSoldProduct() {
		for (int i=0; i<30; i++) {
			
			String prodName = "hammer " + String.valueOf(i+1);
			
			Product prod = new Product(i+1, prodName);
			soldProducts.add(prod);
			System.out.println("Added " + prod);
			
			try {
				Thread.sleep(300); //give time for database to process
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
	public void displaySoldProducts(){ 
		
		for (Product sold: soldProducts) { 
			
			System.out.println("Sold Product " + sold);
			
//			try {
//				Thread.sleep(300); //give time for database to process
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}	
	 
}
