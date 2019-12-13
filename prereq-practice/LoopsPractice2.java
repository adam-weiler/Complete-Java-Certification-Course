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
		
		for (int idx = 0; idx < 100; idx++) { // Too many nested loops. No good!
			for (int j = 0; j < 10; j+=2) {
				for (int k = 0; k < 10; k+=2) {
					for (int l = 0; l < 10; l+=2) {
						System.out.println("The value of idx was " + idx + " --- j was " + j + " --- k was " + k + " --- l was " + l);
					}
				}
			}
		}
	}	
	
}