package java_basics;

public class MyUtils {
	
	public static String printSomeJunk(String argument) {
//		System.out.println("bla bla bla " + argument);
		return "bla bla bla " + argument;
	}
	
	
	public static void printSomeJunk(int argument) {
		System.out.println("Whooo boy! " + argument);
//		return "Whooo boy! " + argument;
	}
	
	public static void sum2Numbers(int firstArg, int secondArg) {
		System.out.println(firstArg + secondArg);
	}

	
	public int add10(int someArgument) {
		int result = someArgument + 10;
		return result;
	}
}