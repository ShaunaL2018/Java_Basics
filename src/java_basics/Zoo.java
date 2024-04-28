package java_basics;

public class Zoo {

	public static void main(String[] args) {
		
		Animal bear = new Animal("Bear", "brown", 8, "female");
		Animal fish = new Animal("Fish", "gray", 1, "male");
		Animal bird = new Animal("Bird", "white", 3, "female");
		
		bear.aboutAnimal();
		fish.aboutAnimal();
		bird.aboutAnimal();
		
	}

}
