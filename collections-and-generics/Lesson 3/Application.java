package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		HashSet<Integer> numValues = new HashSet<Integer>();
		numValues.add(12);
		numValues.add(42);
		numValues.add(13);
		numValues.add(19);
		numValues.add(42);  // This is a duplicate in the Set. Will only be added once.
		numValues.add(100);

		for(Integer value : numValues) {
			System.out.println(value);  // Will not print in same order entered.  // 19, 100, 42, 12, 13
		}
		
		
		HashSet<String> textValues = new HashSet<String>();
		
		textValues.add("abc");
		textValues.add("2 easy as");
		textValues.add("3 one two three");
		textValues.add("4 doh re me");		
		textValues.add("abc");  // This is a duplicate in the Set. Will only be added once.
		textValues.add("6 That's how easy life can be.");

		for(String value : textValues) {
			System.out.println(value);  // Will not print in same order entered.  // Lines 1, 2, 6, 3, 4
		}
		
		
		LinkedHashSet<String> orderedValues = new LinkedHashSet<String>();
		orderedValues.add("ABC");
		orderedValues.add("DEF");
		orderedValues.add("GHI");
		orderedValues.add("JKL");
		orderedValues.add("MNO");
		orderedValues.add("PQR");
		orderedValues.add("PQR");  // This is a duplicate in the Set. Will only be added once.

		for(String value : orderedValues) {
			System.out.println(value);  // Will not print in same order entered.  // ABC, DEF, GHI, JKL, MNO, PQR
		}
		
				
		HashSet<Animal> animals = new HashSet<Animal>();

		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 12);
		Animal animal3 = new Animal("Lion", 12);
		Animal animal4 = new Animal("Tiger", 12);
		Animal animal5 = new Animal("Dog", 12);  // Duplicate values okay.
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
//		System.out.println(animal1.equals(animal5));  // False ; The 2 Dogs are not equal.  The values are same, but the Hash Code is different.
		System.out.println(animal1.equals(animal5));  // True ; Adding the equals() and hashCode() overide in Animal.java, now they both have the same Hash Code.
		System.out.println(animal1.hashCode());  // 70225
		System.out.println(animal5.hashCode());  // 70225
		
		for(Animal value : animals) {
			System.out.println(value);  // Will not print in same order entered.  // Lion, Dog, Dog, Cat, Tiger
		}
	}

}