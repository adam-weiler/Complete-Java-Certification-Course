package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		int values;
		values = 100;

		int [] arrie = new int[100];
		arrie[0] = 1;
		//arrie[1] = "Hello"; // Type mismatch.
		arrie[2] = 1000;
		arrie[99] = 93432;
		
		System.out.println(arrie[54]); // Empty slot is 0.
		System.out.println(arrie[99]); // 93432
//		System.out.println(arrie[100]); // IndexOutOfBounds
		
	
		String [] words = new String[] {"My", "Name", "is"};
		System.out.println(words[2]);
		
		
		String [] words2 = new String[3];
		words2[0] = "My";
		words2[1] = "Name";
		words2[2] = "is";
		System.out.println(words2[2]);
		
		// Change an array's size after the fact.
		words2 = new String[10];
		System.out.println(words2[2]); // Empty slot is null.
	}
}