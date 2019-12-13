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
		
		int i = 0;
		
		while(true) {
			System.out.println("i: " + i);
			int found = str.indexOf("category:", i);
			
			if (found == -1) break;  // If all categories are found, break out of loop.
			
			int start = found + 9;  // +9 because that is length of "category:"
			int end = str.indexOf(" ", start);  // Search for first occurrence of " ", using start as the starting point.
			System.out.println(str.substring(start, end));  // Prints out apparal, makeup, and furniture.
			
			i = end + 1;  // i is set to index of current "category". ie: 85, 134, 168.
		}
	}

}