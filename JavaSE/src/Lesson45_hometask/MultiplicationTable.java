package Lesson45_hometask;

import java.io.FileWriter;
import java.io.IOException;

public class MultiplicationTable {
	public static void main(String[] args) throws IOException {
		FileWriter file =new FileWriter("C:\\Users\\user\\Desktop\\BackEnd\\text.txt");
		  for (int i = 1; i <= 10; i++) {
	            for (int j = 1; j <= 10; j++) {
	            	 String line = i + " x " + j + " = " + (i * j) + "\n";
	            	 System.out.println(" ");
	                file.write(line);
	            }
	        }
		
	}
}
