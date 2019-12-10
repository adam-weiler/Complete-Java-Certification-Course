public class Animal {
	String species;
	int age;
	String gender;
	int weightInPounds;
	
	public Animal(String species, int age, String gender, int weightInPounds) {
		super();
		this.species = species;
		this.age = age;
		this.gender = gender;
		this.weightInPounds = weightInPounds;
	}
	
	public void describe() {
		System.out.println("This animal is a " + species);
		System.out.println("It is " + age + " years old.");
		System.out.println("It is a " + gender);
		System.out.println("It weighs approximately " + weightInPounds + " pounds.");
	}
	
	public void eat() {
		System.out.println("Nom nom nom...");
	}
	
	public void sleeping() {
		System.out.println("ZZZ zzzz zzzz...");
	}
}