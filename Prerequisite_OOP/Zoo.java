public class Zoo {
	public static void main(String args[]) {
		Animal wolf = new Animal("Wolf", 42, "Male", 176);
		Animal squirrel = new Animal("Squirrel", 3, "Male", 14);
		Animal turtle = new Animal("Turtle", 200, "Female", 1543);
		
		wolf.describe();
		squirrel.describe();
		turtle.describe();
		
		
		Fish shark = new Fish("Shark", "Jaws", 42, "Male", 176);
		Fish goldfish = new Fish("Goldfish", "Goldie", 3, "Male", 14);
		Fish salmon = new Fish("Salmon", "Salman Rushdie", 200, "Female", 1543);
		
		shark.describe();
		goldfish.describe();
		salmon.describe();
		
		
		Bird hawk = new Bird("Hawk", "Tobias", 42, "Male", 176);
		Bird parrot = new Bird("Parrot", "Adrien Beaky", 3, "Male", 14);
		Bird bluejay = new Bird("Bluejay", "Cobalt", 200, "Female", 1543);
		
		hawk.describe();
		parrot.describe();
		bluejay.describe();
	}
}