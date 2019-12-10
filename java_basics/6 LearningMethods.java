package java_basics;

import someotherpackage.ExampleClass;

public class LearningMethods {
	public static void main(String[] args) {
		System.out.print("What");
		System.out.println("Huh");
		System.out.print("What");
		System.out.println("Huh");
		
		
//		MyUtils.printSomeJunk("This is some data.");
		System.out.println(MyUtils.printSomeJunk("This is some data."));
		
		
		MyUtils.printSomeJunk(34); //Cannot pass in a number, method is accepting only strings. But making a second method is fine.
//		String testing = MyUtils.printSomeJunk(34);
//		System.out.println(testing);
		
		
		MyUtils.sum2Numbers(7, 6);
		
//		int myVar = MyUtils.add10(32);
//		System.out.println(myVar);
		
//		int myVar2 = MyUtils.add10(99) + 1000 - 50;
//		System.out.println(myVar2);
		
		
		MyUtils myVar;
		myVar = new MyUtils();
		
		myVar.add10(53);
		
		
		ExampleClass.doSomething();
	}
}