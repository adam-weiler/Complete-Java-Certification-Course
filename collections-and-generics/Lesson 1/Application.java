import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		ArrayList words = new ArrayList();  // Stores all data types.
		words.add("hello");  // Saves as String, but stores as Object.
		words.add("there");
		words.add("buppy");
		words.add(10);
		words.add(9);
		words.add(50.9);
		words.add('H');
		words.remove(2);
		
		String item1 = (String) words.get(0);  // Cast object as a String.
		
		Object item2 = words.get(3);  // Cast object as a Object.
		Object item3 = words.get(4);  // Cast object as a Object.
//		System.out.println(item2 + item3);  // This won't work.
		
		int item4 = (int) words.get(2);  // Cast object as a Int.
		int item5 = (int) words.get(3);  // Cast object as a Int.
		System.out.println(item4 + item5);  // This works.

		
		ArrayList<String> words2 = new ArrayList<String>();  // Store only String in list.
		
		
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();  // Store only Int in list.
		
		LinkedList<Double> numbers2 = new LinkedList<Double>();  // Store only Double in list.
		
		LinkedList<Float> numbers3 = new LinkedList<Float>();  // Store only Float in list.

//		numbers.add("omsetehihg");  // This won't work.
		numbers.add(500);  // This works.
		numbers.add(200);  // This works.
		numbers.add(100);  // This works.
		numbers.add(42);  // This works.
		numbers.add(542);  // This works.
		
		for (int num : numbers) {  // Iterates over numbers LinkedList.
			System.out.println(num);
		}		
	}

}