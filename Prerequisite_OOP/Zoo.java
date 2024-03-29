public class Zoo {
	public static void main(String args[]) {
//		Animal wolf = new Animal("Wolf", "Silver", 42, "Male", 176);
//		Animal squirrel = new Animal("Squirrel", "Tippy Toe", 3, "Male", 14);
//		Animal turtle = new Animal("Turtle", "Speedy", 200, "Female", 1543);
		
//		wolf.describe();
//		squirrel.describe();
//		turtle.describe();
		
		
		Fish shark = new Fish("Shark", "Jaws", 42, "Male", 176);
		Fish goldfish = new Fish("Goldfish", "Goldie", 3, "Male", 14);
		Fish salmon = new Fish("Salmon", "Salman Rushdie", 200, "Female", 1543);
		
		shark.describe();
		goldfish.describe();
		salmon.describe();
		
		shark.move();
		
		
		Bird hawk = new Bird("Hawk", "Tobias", 42, "Male", 176);
		Bird parrot = new Bird("Parrot", "Adrien Beaky", 3, "Male", 14);
		Bird bluejay = new Bird("Bluejay", "Cobalt", 200, "Female", 1543);
		
		hawk.describe();
		parrot.describe();
		bluejay.describe();
		
		
//		wolf.eat();
//		wolf.sleep();
//		wolf.swim();  // This won't work.
//		wolf.fly();  // This won't work.
		
		shark.eat();
		shark.sleep();
		shark.swim();
//		shark.fly();  // This won't work.
		
		hawk.eat();
		hawk.sleep();
//		hawk.swim();  // This won't work.
//		hawk.fly();  // This no longer works.
		
		
		Chicken squawky = new Chicken("Chicken", "Squawky", 12, "Female", 20);
//		squawky.fly();  // Chickens cannot fly.
		
		Sparrow chirpy = new Sparrow("Sparrow", "Chirpy", 4, "Female", 2);
		chirpy.fly(); // This still works.
		
//		Animal chirpy = new Sparrow("Sparrow", "Chirpy", 4, "Female", 2);
//		chirpy.fly(); // This no longer works.
		
		chirpy.move();
		chirpy.eat();
		chirpy.sleep();
		
		moveAnimal(shark);
		moveAnimal(chirpy);
		
		
		Flyable flyingBird = new Sparrow("Sparrow", "Birdsong", 5, "Female", 3);  // This will work. Sparrow is extending flyable.
		flyingBird.fly();  // Can only fly. Nothing else.
		
//		Flyable flyingBird2 = new Bird("Sparrow", "Nightingale", 6, "Male", 4);  // This won't work. Bird isn't extending flyable.
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
}