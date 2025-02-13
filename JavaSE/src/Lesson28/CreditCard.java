package Lesson28;

public class CreditCard implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("sdsd");
	}

	@Override
	public void refund(double amount1) {
		System.out.println("HBhm");
	}

}
