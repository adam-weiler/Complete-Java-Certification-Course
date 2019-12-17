package com.aweiler.learningfilereader;

//import java.io.File;
//import java.io.FileReader;
import java.io.*;  // Imports everything from java.io

public class Application {

	public static void main(String[] args) {
		
		File file = new File("myfile.txt");
		BufferedReader bufferedReader = null;
		
		try {
			FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Problem reading the file " + file.getName());
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Unable to close file " + file.getName());
			} catch(NullPointerException ex) {  // You typically shouldn't do this.
				System.out.println(" file was probably never opened " + ex);
			}
		}
	}

}