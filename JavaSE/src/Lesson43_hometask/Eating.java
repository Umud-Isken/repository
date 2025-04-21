package Lesson43_hometask;

public class Eating  extends Thread {
	public void run() {
		for (int i = 1; i <= 5;i++) {
			System.out.println("Sabir is eating" + i);
		try {
			Thread.sleep(850);
		} catch (Exception e) {
	
		}}
	}
}
