public class Zoo {
	public static void main(String args[]) {
		Animal wolf = new Animal("Wolf", "Silver", 42, "Male", 176);
		Animal squirrel = new Animal("Squirrel", "Tippy Toe", 3, "Male", 14);
		Animal turtle = new Animal("Turtle", "Speedy", 200, "Female", 1543);
		
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
		
		
		wolf.eat();
		wolf.sleep();
		//wolf.swim(); //This won't work.
		//wolf.fly(); //This won't work.
		
		shark.eat();
		shark.sleep();
		shark.swim();
		//shark.fly(); //This won't work.
		
		hawk.eat();
		hawk.sleep();
		//hawk.swim(); //This won't work.
		hawk.fly();
		
		
		Chicken squawky = new Chicken("Chicken", "squawky", 12, "Female", 20);
		squawky.fly();
	}
}