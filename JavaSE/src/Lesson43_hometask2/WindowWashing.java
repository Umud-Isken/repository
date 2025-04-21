package Lesson43_hometask2;

public class WindowWashing extends Thread {
	@Override
	public void run() {
		System.out.println("I am clenaing window now");
	}

	public static void main(String[] args) {
		WindowWashing cleaning = new WindowWashing();
		cleaning.setName("Мыть окна");
		cleaning.setPriority(Thread.NORM_PRIORITY);
		cleaning.start();
	}
}
