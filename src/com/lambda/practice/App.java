package com.lambda.practice;

import java.awt.print.Printable;

public class App {

	public static void main(String[] args) {
		Human human = new Human();
		walker(human); 
		
		Robot robot = new Robot();
		robot.walk();
		walker(robot);
		
		//class created on the fly 
		walker(new Walkable() {
			
			private void Cloneable() {
				// TODO Auto-generated method stub

			}

			@Override  //anonymous class
			public void walk() {
				System.out.println("Custom Object is walking");
			}			
		});
		
		walker(() -> {
			System.out.println("Customer Object is walking");
		});
		
		walker(() -> System.out.println("Customer Object is walking"));
	
		//functional interface
		ALambdaInterface aBlockofCode = (() -> {
			System.out.println("Object is walking");
		});
		
		//B Below--Walkable aBlockofCode = (() -> {
		//	System.out.println("Object is walking");
		//});
		
		
		//walker(aBlockofCode);//this is not a Walkable interface not a Lambda Interface
		//B walker(aBlockofCode);//this is not a Walkable interface not a Lambda Interface
		
		//convert method below to lambda but not yet done
		ALambdaInterface helloVar = () -> System.out.println("Hello there");
		helloVar.someMethod();
		
		//functional interface must exist to support the portable calc
		Calculate calcInterfaceSum = (a,b) -> a+b;
		System.out.println(calcInterfaceSum.calculate(5, 10));
		
		Calculate nonZeroDivide = (a,b) -> {
			if (a==0) return 0;
			else return (a/b);
		};
		System.out.println(nonZeroDivide.calculate(6, 3));
		
		//StringWorker print = ((a) -> { - can use generics
		Worker<String> print = ((a) -> {
			String reverse = "";
			for (int i = a.length()-1; i>=0 ; i--) {
				reverse = reverse + a.charAt(i);
			}
			return reverse;
		});
		System.out.println(print.worker("Awesome"));
		
		//FactorialWorker factor = ((n) ->{ Can use generics
		Worker<Integer> factor = ((n) ->{
			//gives the factorial
			int result = 1;
			for(int i=1; i < n; i++) {
				
				result = result * i;
				
			}
			return result;
		});
		System.out.println("Factorial result from 10 is: " + factor.worker(10));
		
	}
	
	//this is a functional interface passed in - having only one method
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}
	
	//convert to lambda
	  //Create interface Greetable with sayHello abstract method
	  //in desired classes implement Greetable and print out Hello There;
	public void sayHello() {
		System.out.println("Hello There");
	}
	
	//convert to lambda
	  //Create interface Summable with syn abstract method
	  //in desired classes implement Summable and print out Hello There;
	public int sum(int arg1, int arg2) {
		return arg1+arg2;
	}
	
	public int nonZeroDivide(int a, int b) {
		if (a == 0) {
			return 0;
		}
		return a/b;
	}
	
	public String reverse (String str) {
		String reverse = "";
		for (int i = str.length()-1; i>=0 ; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
	
	public int factor (int number) {
		//gives the factorial
		int result = 0;
		for(int i=0; i < String.valueOf(number).length(); i++) {
			
			Character num = String.valueOf(number).charAt(i);
			
			if (i==0) {
				result = Integer.parseInt(num.toString());
			}else {
				result = result * Integer.parseInt(num.toString());
			}
		}
		return result;
	}
	
	public int factorial (int number) {
		//gives the factorial
		int result = 1;
		for(int i=1; i < number; i++) {
			
			result = result * i;
			
		}
		return result;
	}
	
	
	
	
}

interface Calculate{
	
	int calculate(int a, int b);
}

interface StringWorker{
	
	String worker(String string);
}

interface FactorialWorker{
	
	int factorialWorker(int number);
}

interface Worker <T>{
	
	T worker(T t);
}

