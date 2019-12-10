public class Bird {
	String species;
	String name;
	int age;
	String gender;
	int weightInPounds;
	
	public Bird(String species, String name, int age, String gender, int weightInPounds) {
		super();
		this.species = species;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weightInPounds = weightInPounds;
	}
	
	public void describe() {
		System.out.println("This animal is a " + species + " called " + name);
		System.out.println("It is " + age + " years old.");
		System.out.println("It is a " + gender);
		System.out.println("It weighs approximately " + weightInPounds + " pounds.");
	}
	
	public void eat() {
		System.out.println("Caw caw caw...");
	}
	
	public void sleeping() {
		System.out.println("ZZZ zzzz zzzz...");
	}
}