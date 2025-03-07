package Lesson34_hometask2;

public class Test {
	public static void main(String[] args) {
		RegistrationService registrationService = new RegistrationService();
		try {
			registrationService.registerUser(16);
		} catch (AgeRestrictionException e) {
			System.out.println("Ошибка: " + e.getMessage());
		}

		try {
			registrationService.registerUser(20);
		} catch (AgeRestrictionException e) {
			System.out.println("Ошибка: " + e.getMessage());
		}
	}
}
