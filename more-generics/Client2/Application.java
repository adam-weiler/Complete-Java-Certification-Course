package client2;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		System.out.println(myObject);  // hello
		
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		System.out.println(emp);
		
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());
		ArrayList<Accountant> accountants = new ArrayList<Accountant>();
		accountants.add(new Accountant());
//		employees = accountants;  // This is not allowed in generics.
		
		
		ArrayList<?> employees2 = new ArrayList<>();  // The ? is a wildcard.
		ArrayList<Accountant> accountants2 = new ArrayList<Accountant>();
		employees2 = accountants2;  // This is okay.  Considers it a list of objects.
		
		
		// Upper bound; the highest type that can go in here is Employees, and their children.
		ArrayList<? extends Employee> employees3 = new ArrayList<>();  // Accepts data from Employee and children of Employee.
//		ArrayList<String> accountants3 = new ArrayList<String>();  // This won't work.
		ArrayList<Accountant> accountants3 = new ArrayList<Accountant>();  // This is okay.
		employees3 = accountants3;  // This is okay.  Considers it a list of objects.
		
		
		ArrayList<Employee> employees4 = new ArrayList<Employee>();  // This is okay.
		employees3 = employees4;  // This is okay too.
		
		
		// Lower bound; the lowest type that can go in here is Employee, and their parent.
		ArrayList<? super Employee> employees5 = new ArrayList<>();  // Needs to be an Employee or parent of Employee.
		ArrayList<Accountant> accountants4 = new ArrayList<Accountant>();  // This won't work.
//		employees5 = accountants4;  // This won't work.
		
		
		makeEmployeeWork(employees);  // This works.
		makeEmployeeWork(accountants);  // This works
	}
	
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {  // Make the list of employees work.  Also their children.
		for(Employee emp : (ArrayList<Accountant>) employees) {
			emp.work();
		}
	}

}