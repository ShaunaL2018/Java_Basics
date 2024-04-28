package java_basics;

public class StringPractice {

	public static void main(String[] args) {

		String a = "hello    ";
		System.out.println(a.length());
		
		System.out.println(a.substring(0, 4));
		
		System.out.println(a.charAt(2));
		
		//what is meant by Strings not immutable?? Value in memory does NOT change
		a = "Bye";
		System.out.println(a);
		
		
		
		//unicode
		System.out.println(a.codePointBefore(2));
		System.out.println(a.indexOf("lo"));
		
		///CLONE EXAMPLE///////////////////////
		Human human = new Human("Shauna", 40, 0, "brown");
		try {
			Human human2 = (Human) human.clone();
			System.out.println("Human2 Details: " + human2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
