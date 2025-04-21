package Lesson45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
	public static void main(String[] args) throws IOException {
//		File file =new File("C:\\Users\\user\\Desktop\\example.txt");
////		try {
////			file.createNewFile();
////		} catch (IOException e) {
////			e.printStackTrace();
////		}	
//		
//		if (file.createNewFile()) {
//			System.out.println("File dowload success");
//		}else {
//			System.out.println("File is useful");
//		}
//		
//		
//		C:\\Users\\user\\Desktop\\example.txt
		FileWriter fileWriter = new FileWriter("C:\\Users\\user\\Desktop\\example.txt");
		fileWriter.write("Hello my classmates");
		fileWriter.close();
	}
	
	
}	
