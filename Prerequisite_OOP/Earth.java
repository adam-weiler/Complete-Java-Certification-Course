public class Earth {
	public static void main(String args[]) {
//		Human tom; // Procedure 1
//		tom = new Human(); // Procedure 1
//		tom.age = 42;
//		tom.eyeColour = "black";
//		tom.heightInInches = 92;
//		tom.name = "Tommy Zsabo";
//		tom.speak();
		
		
//		Human joe = new Human(); // Procedure 2
//		joe.age = 13;
//		joe.eyeColour = "silver";
//		joe.heightInInches = 9;
//		joe.name = "Joey Tribianni";
//		joe.speak();
		
		
		Human human1 = new Human("Tommy Zsabo", 42, 92, "black");
		Human human2 = new Human("Joey Tribbianni", 13, 9, "silver");
		Human human3 = new Human("Marco Polo", 35, 28, "copper");
		
		human1.speak();
		human2.speak();
		human3.speak();
	}
}