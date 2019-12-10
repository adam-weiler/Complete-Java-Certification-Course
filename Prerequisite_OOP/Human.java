public class Human {
	String name;
	int age;
	int heightInInches;
	String eyeColour;
	
	public Human(String name, int age, int heightInInches, String eyeColour) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColour = eyeColour;
	}

	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am  " + heightInInches + " inches tall.");
		System.out.println("My age is " + age + " years old.");
		System.out.println("My eyes are " + eyeColour);
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void work() {
		System.out.println("working...");
	}	
}