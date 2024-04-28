package java_basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class JavaPractice {

	public static void main(String[] args) {
		sequencePlay();
		//getDaysTest();
		//getDayByValue(2);
		//getValuebyDay("Thursday");
		/*
		 * try { getMyFile(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 * 
		 * File tryThis = MyFileCached.getInstance().getMyFile();
		 * System.out.println("Can I see file " + tryThis.getName()); //yes I can see
		 * the file
		 */	
		
		double[] prices = new double[3];
		String[] notes = new String[3];
		
//		prices: [35000, 35000]
//				notes:
//				["35000.0% higher than in-store", 
//				 "10000.0% lower than in-store"]
//				x: 150
		
	//ices: [40, 40, 40, 40]
	//	notes:
	//	["0.001% higher than in-store", 
	//	 "0.0% lower than in-store", 
	//	 "0.0% higher than in-store", 
	//	 "0.0% lower than in-store"]
	//	x: 0
		
		prices[0] = 40.00;
		prices[1] = 40.00;
		prices[2] = 40.00;;
		
		notes[0] = "0.001% higher than in-store";
        notes[1] =  "0.0% lower than in-store";
        notes[2] = "0.0% lower than in-store";
        
		//boolean result = solution(prices, notes, 0);
		//System.out.println(result);
		
	}
	
	public static void getDaysTest() {
		for(Weekdays weekday: Weekdays.values()) {
			String day = weekday.toString();
			System.out.println("Weekday: " + day);
		}
	}
	
	public static void getDayByValue(int dayOfWeek) {
		System.out.println("Day of Week based on " + dayOfWeek);
		System.out.println("Weekday " + Weekdays.getDayByValue(dayOfWeek));
	}
	
	public static void getValuebyDay(String dayOfWeek) {
		System.out.println("Day value based on " + dayOfWeek);
		System.out.println("Week day value " + Weekdays.getValueByDay(dayOfWeek));
	}
	
	public static void getMyFile() throws IOException {
		
		MyFileCached myFileCached = MyFileCached.getInstance();
		File myFile = null;
		try {
			myFile = myFileCached.getMyFile();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if (myFile !=null) {
			try (BufferedReader bf = new BufferedReader(new FileReader(myFile))){
		
			//BufferedReader bf = new BufferedReader(new FileReader(myFile));
			String line = null;
			
			while ((line = bf.readLine()) !=null) {
				String[] lineContent = line.split(",");
				String word = lineContent[0];
				System.out.println("Line text is: " + word);
						
			}
			
			//bf.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static boolean solution(double[] prices, String[] notes, double x) {

		boolean solution = false;
		int zeroValue = 0;

		double[] notesPercentage = new double[notes.length];
		int counter = 0;

		    for (String note : notes) {        
		        
		        if (note.contains("%")){
		            
		            int index = note.indexOf("%");
		            double number = Double.valueOf(note.substring(0, index)); 
		            number = number / 100;   
		            notesPercentage[counter] = number;
		            
		        } else{
		            notesPercentage[counter] = zeroValue;
		        } 
		        counter++;
		    }    
		    
		    double total = 0.00;
		    
		    //if (prices.length == notesPercentage.length){
		        
		    for (int i = 0; i < notesPercentage.length; i++) {      
	             
	            if (notesPercentage[i] != 0.0){
	            		Double basePrice = 0.00;
	            		Double difference = 0.00;
	            		
	            		if (notes[i].contains("higher")) {
	            			basePrice = prices[i] / (notesPercentage[i] + 1.00);
	            			
	            			//basePrice = (double) Math.round(basePrice);
	            			//basePrice = basePrice.doubleValue();
	            			//String basePrice2 = String.format("%.2f", basePrice);
	            			//BigDecimal basePrice2 = new BigDecimal(basePrice);
	            			
	            			Double basePrice2 = Math.floor(basePrice * 1e2) / 1e2;
	            			difference = prices[i] - basePrice2;
	            			//System.out.println(40.0-39.99);
	            			//System.out.println(basePrice2);
	          
	            		} else {
	            			basePrice = prices[i] * (notesPercentage[i] + 1.00);
	            			Double basePrice2 = Math.floor(basePrice * 1e2) / 1e2;
	            			
	            			difference = prices[i] - basePrice2;
	            		}
	            		total = total + difference;
	             }     
	             
	         }  
		        
		    //}
		    
		    if (total <= x){
		        solution = true;
		    }

		return solution;

		}
	
	public static boolean sequencePlay() {
		//boolean solution(int[] sequence) {
		    
			int[] sequence = new int [6];
			sequence[0] = 1;
			sequence[1]	= 2;
			sequence[2] = 3;
			sequence[3] = 4;
			sequence[4] = 3;
			sequence[5] = 6;
			    
		    boolean solution = false;
		    int notIncreasingValues = 0;
		    
		    List<Integer> numbers = new ArrayList<>();
		    List<Integer> numbers2 = new ArrayList<>(); //romove not perfect
		    List<Integer> numbersOO = new ArrayList<>();
		    
		    for (int integer : sequence) {
		        numbers.add(integer);
		    }
		    numbers2.addAll(numbers);
		    
		    for (int i=numbers.size()-1; i > 0; i--) {
		        if (numbers.get(i) > numbers.get(i-1)){
		            continue;
		        } else {
		                        
		            numbersOO.add(numbers.get(i));
		            numbersOO.add(numbers.get(i-1));         
		            if ((numbers.get(i) <= numbers.get(i-1)) &&
		            		(numbers.get(i) <= numbers.get(i-2))){
		            	numbers2.remove(i); //not sure of which to remove???
		            } else {
		                numbers2.remove(i-1);
		            }
		            notIncreasingValues++;
		            break;
		        }
		    }
		    
		     for (int i=numbers2.size()-1; i > 0; i--) {
		        if (numbers2.get(i) > numbers2.get(i-1)){
		            continue;
		        } else {
		            notIncreasingValues++;
		        }
		    }
		    
		    
		    //only 1 increasing value
		    if (notIncreasingValues == 1){
		        solution = true;
		    }
		    
		    return solution;
		    

	}

}
