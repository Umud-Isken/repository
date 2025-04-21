package Lesson43_hometask2;

public class Trash extends Thread {
	@Override
	public void run() {
		System.out.println("Throw trasing");
	}

	public static void main(String[] args) {
		Trash trash = new Trash();
		trash.setName("Выкинуть мусор");
		trash.setPriority(Thread.MAX_PRIORITY); 
		trash.start();
	}
}
