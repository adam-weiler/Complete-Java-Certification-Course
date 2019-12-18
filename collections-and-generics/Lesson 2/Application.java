package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
//		ArrayList<String> animals = new ArrayList<String>();
		List<String> animals = new ArrayList<String>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Bird");
		
//		for(int i = 0; i < animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//		
//		for (String value : animals) {
//			System.out.println(value);
//		}
		
		
//		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
//		LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyota", "Camray", 120000, false);
		vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep", "Rangler", 25000, true));
		
		
//		for (int i = 0; i < vehicles.size(); i++) {
//			System.out.println(vehicles.get(i).getMake());
//		}
//		
//		for (Vehicle value : vehicles) {
//			System.out.println(value.getMake());
//		}
		
		printElements(animals);
		printElements(vehicles);
	}
	
	public static void printElements(List someList) {
		
		for(int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}

}
