package Lesson46_hometask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class first {
	public static void main(String[] args) throws IOException {
	    File file = new File("C:\\Users\\user\\Desktop\\BackEnd\\User2.txt");
	    file.createNewFile();

	   

	    try (FileReader fileReader = new FileReader(file)) {
	        int symbol;
	        while ((symbol = fileReader.read()) != -1) {
	            System.out.print((char) symbol);
	        }
	    }
	}

}
