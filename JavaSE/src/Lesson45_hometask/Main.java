package Lesson45_hometask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		FileWriter filename = new FileWriter("C:\\Users\\user\\Desktop\\BackEnd\\User.txt");
		filename.write(string);
		System.out.println("Имя сохранено в файл!");
		filename.close();
	}
}
