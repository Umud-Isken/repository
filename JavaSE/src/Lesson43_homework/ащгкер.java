package Lesson43_homework;

public class ащгкер extends Thread{
	public void run() {
		while (true) {
			System.out.println("Смотрю кино");
			try {
				Thread.sleep(1890);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
