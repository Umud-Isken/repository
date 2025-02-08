package Lesson27_hometask2;

public class CreditCardPayment extends Payment{
	@Override
	void pay(double amount) {
		System.out.println("Оплата картой на сумму X");
	}
}
