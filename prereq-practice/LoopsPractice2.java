package practice.loops;

public class LoopsPractice2 {
	
	public static void main(String args[]) {
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println("char: " + str.charAt(i));
		}
		
		for (int i = 0; i <= 100; i+=2) {
			System.out.println("i: " + i);
		}
	}	
	
}