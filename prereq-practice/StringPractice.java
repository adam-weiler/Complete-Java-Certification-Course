package practice.strings;

public class StringPractice {
	public static void main(String[] args) {
		String a = "hello -%^@      ";
		System.out.println(a.length());  // 16 characters long.
		
		String str = "ABCDEFG";
		System.out.println(str.charAt(3));  // D
//		System.out.println(str.charAt(13));  // This won't work.
//		System.out.println(str.charAt(-1));  // This won't work.
		
		String extractedString = str.substring(4);
		System.out.println(extractedString);  // EFG
		
		String extractedString2 = str.substring(3, 5);
		System.out.println(extractedString2);  // DE
		
		
		String str2 = "Then they chose the bar near the theater.";
		int i = str2.indexOf("the");  // Starts search at index 0.
		System.out.println(i); // 5
		int j = str2.indexOf("the", 15);  // Starts search at index 15.
		System.out.println(j); // 16
		int k = str2.lastIndexOf("the");  // Starts at last index.
		System.out.println(k); // 33
		
		int l = str2.indexOf("purple");  // Not in the string.
		System.out.println(l); // -1
		
		
		String aa = "hello";
		String bb = "there";
		
		if (a == "hello") {
			// DON'T DO THIS!!  This is a trap! 
		}
		
		if (aa.contentEquals(bb)) {
			// USE THIS!!
		}
		
		if (bb.equalsIgnoreCase("THERE")) {
			System.out.println("This will ignores case.");
		}
	}
}