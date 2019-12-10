public class Sparrow extends Bird implements Flyable{
	public Sparrow(String species, String name, int age, String gender, int weightInPounds) {
		super(species, name, age, gender, weightInPounds);
	}

	public void fly() {
		System.out.println("Soar, soar, soar...");
	}
}