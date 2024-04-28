package com.lambda.practical;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Car {
	
	String make;
	String model;
	String color;
	int price;
	
	public Car(String make, String model, String color, int price) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cars [make=" + make + ", model=" + model + ", color=" + color + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, make, model, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && Objects.equals(make, other.make)
				&& Objects.equals(model, other.model) && price == other.price;
	}
	
	public void printCar() {
		System.out.println(this);
	}
		
	/*
	 * public static void printCarsPriceRange(List<Car> cars, int low, int high) {
	 * for (Car c: cars) { if(low <= c.getPrice() && c.getPrice() <=high) {
	 * c.printCar(); } } }
	 */
	
	//*NO Longer Need with implementing functional interface and Lambda
	// public static void printByColor(List<Car> cars, String color) { for (Car c:
	// cars) { if(c.getColor().equals(color)) { c.printCar(); } } }
		 

}
