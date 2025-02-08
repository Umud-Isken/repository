package Lesson27_hometask2;


public class Main {
	public static void main(String[] args) {
		CreditCardPayment credit =new CreditCardPayment();
		credit.pay(12000);
		
		PayPalPayment pay =new PayPalPayment();
		pay.pay(230000);
	}
}
