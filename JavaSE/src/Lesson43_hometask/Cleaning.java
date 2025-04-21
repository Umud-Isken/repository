package Lesson43_hometask;

public class Cleaning  extends Thread {
	public void run() {
		for (int i = 1; i <= 5;i++) {
			System.out.println("Sabir is cleaning the room" + i);
		try {
			Thread.sleep(700);
		} catch (Exception e) {
	
		}}
	}
}
