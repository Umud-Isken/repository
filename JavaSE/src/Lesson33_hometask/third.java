package Lesson33_hometask;


public class third {
	public static void checkAge(int age) {
//		int age = 10;
		if(age < 18) {
			throw new IllegalArgumentException("You age must to be more 18");
		}
		System.out.println("You age is more than 18");
	}
	public static void main(String[] args) {
		checkAge(10);
	}
}
