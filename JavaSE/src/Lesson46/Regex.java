package Lesson46;

public class Regex {
	public static void main(String[] args) {
		String phoneNumber = "telefon: 010-727-78-47";

		// replace numbers \\d
//		String newPhoneNumber  = phoneNumber.replaceAll("\\d", "*");
//		System.out.println(newPhoneNumber);

		// I hate reject

//		показывает правельность email
		String emailSting = "umud@gmail.com";
//		boolean ok = emailSting.matches("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
//		System.out.println(ok);

		// показывает правельность creaditcard
		String creditCard = "4169738876731641";
//		boolean ok2 = creditCard.matches("(^4[0-9]{12}(?:[0-9]{3})?$)|(^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$)|(3[47][0-9]{13})|(^3(?:0[0-5]|[68][0-9])[0-9]{11}$)|(^6(?:011|5[0-9]{2})[0-9]{12}$)|(^(?:2131|1800|35\\d{3})\\d{11}$)");
//		System.out.println(ok2);

		//показывает правельность ipAdress
		String ipAderss = "12.456.67.56";
//		boolean ok3 = ipAderss.matches("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
//		System.out.println(ok3);

		//показывает правельность username
		String username = "Iskenderov";
//		boolean ok4 = username.matches("^[a-z0-9_-]{3,15}$");
//		System.out.println(ok4);
		
		//показывает правельность password
		String password = "123Jdb";
//		boolean ok5 = password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$");
//		System.out.println(ok5);
	}
}
