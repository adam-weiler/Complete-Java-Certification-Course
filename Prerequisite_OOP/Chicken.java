public class Chicken extends Bird{
	public Chicken(String species, String name, int age, String gender, int weightInPounds) {
		super(species, name, age, gender, weightInPounds);

	}
	
	public void fly() {
		System.out.println("Chickens cannot fly...");
	}
}