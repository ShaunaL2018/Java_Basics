package java_basics;

public class Earth {

	public static void main (String[] args) {
		
		Human human1;
		Human human2;
		
		human1 = new Human("John", 65, 22, "blue");
		
		human1.speak();
		
		human2 = new Human("Tom", 65, 22, "brown");
		
		human2.speak();
		
	}
	

}
