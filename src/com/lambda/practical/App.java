package com.lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(
				new Car("Honda","Accord","Red", 22300),
				new Car("Honda","Civic","Blue", 17700),
				new Car("Toyota","Land Cruiser","White", 48500),
				new Car("Toyota","Corolla","Black", 16200),
				new Car("Toyota","Camry","Blue", 24000),
				new Car("Nissan","Sentra","White", 17300),
				new Car("Mitsubishi","Lancer","White", 20000),
				new Car("Jeep","Wrangler","Red", 24500)
			//cars.stream().filter(e -> e.getColor
		);
		
		//Printing cars between price 18000 and 22000 with the use of anonymous classes and lambda
		//one method two implementations - polymorphism and encapsulation
		printCars(cars, new Predicate<Car>() {
			
			@Override
			public boolean test(Car c) {
				return c.getPrice() >=18000 && c.getPrice() <=22000;
			}
		});
		printCars(cars, new Predicate<Car>() {
			
			@Override
			public boolean test(Car c) {
				return c.getColor().equals("Blue");
			}
		});
		
		//replacing use of anonymous classes above with direct lamba/functional interface usage
		printCars(cars, (c) -> ((Car) c).getPrice() >=18000 && ((Car) c).getPrice() <=22000);
		printCars(cars, (c) -> ((Car) c).getColor().equals("Blue"));
		

		
		//First used CarCondition then Changes to Condition then can use build in Predicate 
				
	}
	  
	/*
	 * public static void printCars(List<Car> cars, Condition condition){ for (Car
	 * c: cars) { if(condition.test(c)){ c.printCar(); } } }
	 */
	  
	  public static void printCars(List<Car> cars, Predicate condition){
		  for (Car c: cars) { 
			  if(condition.test(c)){ 
				  c.printCar(); 
			  } 
		  } 
	  }
	

}
