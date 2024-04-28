package java_basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.my.exceptions.GenericException;

public class FileProcessing {
	
	public static void main (String[] args) {
		//inputTest();
//		try {
//			fileScannerTest();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	
	}
	
	public static void inputTest() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text:");
		String entered = input.nextLine();
		System.out.println("Entered text: " + entered);
	
	} 
	
	public static void fileScannerTest() throws FileNotFoundException {
		File file = new File("myFileReader.txt");
		try 						{
			Scanner scanFile = new Scanner(file);
		
			while(scanFile.hasNextLine()) {
				String line = scanFile.nextLine();
				System.out.println(line);
			}
			scanFile.close();
		
		} catch (GenericException e) {//my Generic exception not recognized :-<...will need to fix
			System.out.println("My Generic error caught");
			e.printStackTrace();
			e.getClass();
			e.getMessage();
		}
	}
	
	
}
