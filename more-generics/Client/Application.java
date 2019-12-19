package client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
	
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList();
		myList.add("hello");
//		myList.add(100);  // Not allowed.
//		myList.add(false);  // Not allowed.
		
		String myval = (String) myList.get(0);
//		String myval2 = (String) myList.get(1);
		
		
		Container<Integer, String> container = new Container<>(12, "Hello");
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		
		
		Container<Double, String> container2 = new Container<>(12.8, "Hello");
		double val3 = container2.getItem1();
		String val4 = container2.getItem2();
		
		
		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("third");
		
		Set<String> mySet2 = new HashSet<String>();
		mySet1.add("1st");
		mySet1.add("2nd");
		mySet1.add("3rd");
		
		Set<String> resultSet = union(mySet1, mySet2);
		
		Iterator<String> itr = resultSet.iterator();
		while(itr.hasNext()) {
			String vars = itr.next();
			System.out.println(vars);
		}
	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		
		return result;
	}

}