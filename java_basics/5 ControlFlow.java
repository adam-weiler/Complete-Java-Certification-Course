package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry = false;
		
		if(!hungry) {
			System.out.println("I'm starving ...");	
		} else {
			System.out.println("I just ate.");
		}
		
		
		int hungerRating = 5;
		if(!(hungerRating < 6)) {
			System.out.println("Not hungry");
		} else {
			System.out.println("I'm starving...");
		}
		
		
		if(!(hungerRating != 6)) {
			System.out.println("Not hungry");
		} else {
			System.out.println("I'm starving...");
		}
		
		
		int favouriteTemp = 75;
		int currentTemp = 100;
		String opinion;
		
		if (currentTemp <= (favouriteTemp - 30)) {
			opinion = "It's pretty darn cold!";
		} else if(currentTemp < favouriteTemp - 20) {
			opinion = "It's kinda cold out...";
		} else if(currentTemp > favouriteTemp + 10) {
			opinion = "It's hot hot.";
		} else {
			opinion = "It's a beautiful day.";
		}
		System.out.println(opinion);
		
		
		if (favouriteTemp == currentTemp) { 
			if (currentTemp <= (favouriteTemp - 30)) {
				opinion = "It's pretty darn cold!";
			} else if(currentTemp < favouriteTemp - 20) {
				opinion = "It's kinda cold out...";
			} else if(currentTemp > favouriteTemp + 10) {
				opinion = "It's hot hot.";
			} else {
				opinion = "It's a beautiful day.";
			}
		} else {
			opinion = "unknown temp";
		}
		System.out.println(opinion);	
		
		
		int month = 4;
		String monthString;
		switch (month) {
			case 1: monthString = "January";
				break;
			case 2: monthString = "February";
				break;
			case 3: monthString = "March";
				break;
			case 4: monthString = "April";
				break;
			default: monthString = "Unkown month";
		}
		System.out.println(monthString);

	}
}
