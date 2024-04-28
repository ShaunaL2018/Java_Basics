package java_basics;

import java.util.Objects;

public class Human implements Cloneable{
	
	String name;
	int heightInches;
	int age;
	String eyeColor;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Human(String name, int heightInches, int age, String eyeColor) {
		super();
		this.name = name;
		this.heightInches = heightInches;
		this.age = age;
		this.eyeColor = eyeColor;
	}

	public void speak() {
		System.out.println("Hello my name is: " + name);
		System.out.println("I am height in inches: " + heightInches);
		System.out.println("I am age: " + age);
		System.out.println("My eye color is: " + eyeColor);
	}
	
	public void eat() {
		System.out.println("Eating....");
		
	}
	
	public void walk() {
		System.out.println("Walking....");
		
	}

	public void working() {
		System.out.println("Working....");
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, eyeColor, heightInches, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return age == other.age && Objects.equals(eyeColor, other.eyeColor) && heightInches == other.heightInches
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", heightInches=" + heightInches + ", age=" + age + ", eyeColor=" + eyeColor
				+ "]";
	}
	
	
}
