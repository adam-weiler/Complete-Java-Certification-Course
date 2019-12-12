package practice.loops;

public class LoopsPractice {
	
	public static void main(String args[]) {
//		int count = 0;
//		
//		while(count <= 100) {
//			System.out.println("Your count is: " + count);
//			count = count +1;
//			
//			if (count == 30) {
//				break;	
//			}
//		}
		
		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apparal and the slightly "
				+ "more in demand category:makeup, along with the category:furniture and --";
		
		printCategories(str);
	}
	
	/**
	 * 
	 * Extract all categories from the string argument.
	 * @param str
	 */
	public static void printCategories(String str) {
//		System.out.println(str);
		
		int count = 0;
		
		while(count <= str.length()) {
			System.out.println("Count " + count);
			
			int temp = str.indexOf("category", count);  // Searches for "category" in the string, starting at value count.
			System.out.println("Temp" + temp);
			
			
			if (temp == -1) {  // If all categories are found, break out of loop.
				break;
			}
			
			String ourCategory = str.substring(temp + 9);  // +9 because that is length of "category:"
			System.out.println(ourCategory);
			
			count = temp + 1;  // Count is set to index of current "category". ie: 68, 117, 118, or 150
			System.out.println(" "); // 68, 117, 149
		}
	}

}