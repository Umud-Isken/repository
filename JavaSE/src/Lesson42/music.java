package Lesson42;

public class music implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Ктото слушает " + i);
			try {
				Thread.sleep(2500);
			} catch (Exception e) {

			}
		}

	}

	

	
}
