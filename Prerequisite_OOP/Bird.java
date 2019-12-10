public class Bird extends Animal {
	public Bird(String species, String name, int age, String gender, int weightInPounds) {
		super(species, name, age, gender, weightInPounds);
	}

	public void eat() {
		System.out.println("Caw caw caw...");
	}
}