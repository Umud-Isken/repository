package Lesson43_hometask2;

public class Main {
	public static void main(String[] args) {
		Thread vacuuming = new Vacuming();
        Thread cleaning = new WindowWashing();
        Thread trash = new Trash();

        vacuuming.start();
        cleaning.start();
        trash.start();
	}
}
