package java_basics;

import java.math.BigDecimal;

public class VariablesContined {

	public static void main(String[] args) {
		
		int var = 2000000000;
		
		//all these numbers can also go negative.
		long bigNumber  = 39999999999999999L;
		//need to add an L meaning long
		
		//choose number data type wise; don't want to waste memory space;
		short number = 32766;
		byte num = 126;
		//really small number\
		
		double dblNumber = 333.22;
		
		boolean decision = false;
		char letter = 'A';
		
		//website on Java Data Types - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		BigDecimal bNumber = new BigDecimal(500);
		BigDecimal[] bNumbers = bNumber.divideAndRemainder(new BigDecimal(3));
		for (BigDecimal bigDecimal : bNumbers) {
			//System.out.println(bigDecimal);
		}
		
		
	}

}
