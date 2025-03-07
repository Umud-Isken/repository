package Lesson34_hometask2;

public class RegistrationService {
	public void registerUser(int age) throws AgeRestrictionException {
		if (age < 18) {
			throw new AgeRestrictionException("Вы должны быть старше 18 лет.");
		}
		System.out.println("Пользователь зарегистрирован.");
	}
}
