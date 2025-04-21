package Lesson44;

public class Bank {
	boolean money = false;

	// производительносить
	synchronized void put() throws InterruptedException {
		if (money == true)
			wait();
		money = true;
		System.out.println("I have money in my Bank");
		// передаем что передали продукт
		notify();

	}

	// потребность
	synchronized void get() throws InterruptedException {
		if (money == false)
			wait();
		money = false;
		System.out.println("I haven't money in my Bank");
		notify();
	}
	
	
}
