package java_basics;

public class LearningMethods {

	public static void main(String[] args) {
	
		//visit the System class and review all methods
		
		MyUtils.printSomeJunk("This is Junk");
		
		String printingJunk = MyUtils.printSomeJunk("Junk", "More Junk");
		System.out.println(printingJunk);
		
		System.out.println(MyUtils.printSomeJunk(printingJunk, printingJunk));
	}

}
