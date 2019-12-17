import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		for (int i = 0; i <= 1; i++) { // Asks for input 2 times.
			Scanner input = new Scanner(System.in);
			System.out.println("Enter some text: ");
			String enteredText = input.nextLine();
			System.out.println(enteredText);
		}

		try {
			File file = new File("myFile.txt"); // Opens file.
			Scanner input;
			input = new Scanner(file);

			while (input.hasNextLine()) { // Prints out each line in file.f
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();

		} catch (FileNotFoundException e) {  // If something goes wrong, this happens.
			// TODO Auto-generated catch block
			System.out.println("File not found.");
			e.printStackTrace();
		}
	
		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.subtract10FromLargerNumber(15));  // This works.
			System.out.println(myUtil.subtract10FromLargerNumber(9));  // Then this breaks;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}