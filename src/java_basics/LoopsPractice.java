package java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class LoopsPractice {

	public static void main(String[] args) {
		
		//stringPlay();
		
		//extract all categories from string argument		
		//String argument = "We have a large inventory of things in our warehouse falling in the category: apparel and the slightly more in demand category: makeup along with the category: furniture and....";
		//find and search for all categories in the string
		//substring
		//index of - if not finding will return -1; if found returns index
		//while loop		
		//getCategoriesandPrint(argument);
			
		//loopPractice2();
		collectionPlay();
		
	}
	
	public static void getCategoriesandPrint(String argument) {
		
		int totalCount = 3;
		int counter = 0;
		int finds = 0;
		
		while (counter < totalCount) {
			finds = argument.indexOf(": ", finds);
			//String word = argument.substring(finds);
			//int end = word.indexOf("",finds+3);
			if (finds > 0) {
				String found = argument.substring(finds+2, finds+11);
				int lastIndex = found.indexOf(" ");
				if (lastIndex > 0) {
					found = found.substring(found.indexOf(found), lastIndex);
				}
				//System.out.println("Category: " + argument.substring(finds+2, finds+11));
				System.out.println("Category: " + found);
			}
			finds = finds+5;
			counter++;
		}
		
		
	}
	
	
	 
	public static void stringPlay() {
		int count = 1;
		while (count <= 100) {
			System.out.println("Hey Shauna. Counting: " + count);
			count++;
		}
		
		//This test will not execute with ! added
		count = 0;
		while (!(count <= 100)) {
			System.out.println("Hey Shauna. Counting: " + count);
			count++;
		}
		
		String x = "";
		count = 0;
		do {
		 count++;
		 x = x.concat(String.valueOf(count));
		} while (count < 50);
		
		System.out.println("Value of X: " + x);
		
		
	}
	
	public static void loopPractice() {
		
		String name = "sfdfewencsoidfhsjdf";
		
		for (int i=name.length()-1; i > -1; i--) {
			
			System.out.println("Char: " + name.charAt(i));
		 }
	}
	
	public static void loopPractice2() {
		
		for (int i=1; i<=100; i++) {
			
			if (i % 2 ==0) {
				System.out.println("Even Numbers: " + i);
			}
			
			
		}
		
	}
	
	public static void collectionPlay() {
		
		List<Integer> list2 = Arrays.asList(1,2,3,4);
		List<String> names = new ArrayList<>();
		
		names.add("John");
		names.add("Phillip");
		
		LinkedList<Integer> lList = new LinkedList<>();
		lList.add(5);
		lList.add(10);
		lList.add(15);
		
		List clone = (List) lList.clone();
	
		//LinkedList<Integer> lList2 = lList.clone();
		
		
		
		Vector vector = new Vector<>();
		Map map = new HashMap<>();
	}
	

}
