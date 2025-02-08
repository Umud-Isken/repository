package Lesson27_hometask2;

public class PayPalPayment extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("Оплата через PayPal на сумму X");
	}
}
