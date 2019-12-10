public class Fish extends Animal {
	public Fish(String species, String name, int age, String gender, int weightInPounds) {
		super(species, name, age, gender, weightInPounds);
	}

	public void eat() {
		System.out.println("Blub blub blub...");
	}
	
	public void swim() {
		System.out.println("Swish, swish, swish...");
	}

	public void move() {
		System.out.println("Fish is swishing tail...");
	}
}