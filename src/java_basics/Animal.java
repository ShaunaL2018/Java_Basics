package java_basics;

public class Animal {
	
	String animalFamily;
	String animalColor;
	int animalSize;
	String animalGender;
	
	
	public Animal(String animalFamily, String animalColor, int animalSize, String animalGender) {
		super();
		this.animalFamily = animalFamily;
		this.animalColor = animalColor;
		this.animalSize = animalSize;
		this.animalGender = animalGender;
	}

	public void aboutAnimal() {
		System.out.println("Animal is a: " + animalFamily);
		System.out.println("Animal color is: " + animalColor);
		System.out.println("Animal size is: " + animalSize);
		System.out.println("Animal gender is: " + animalGender);
	}
	public void animalEats() {
		
	}
	
	public void animalSleeps() {
		
	}
	
	public void animalHabitat() {
		
	}

}
