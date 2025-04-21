package Lesson44;

public class Main {
	public static void main(String[] args) {
		Bank store = new Bank();
		Thread product = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				try {
					store.put();
				} catch (Exception e) {

				}
			}
		});

		Thread consumer = new Thread(() -> {
			for (int i = 0; i < 3; i++) {
				try {
					store.get();
					Thread.sleep(1000);
				} catch (Exception e) {

				}
			}
		});
		product.start();
		consumer.start();
		
		
		
		
		
		
		
		
		

	}
}
