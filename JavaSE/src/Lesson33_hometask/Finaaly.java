package Lesson33_hometask;

public class Finaaly {
	public static void main(String[] args) {
		try {
			int num = 10;
			int result = num / 0;
		} catch (ArithmeticException e) {
//			System.err.println("You musn't devide number to zerro");
			System.err.println(e.getMessage());
		}finally {
			System.out.println("You cannot to devide the number to rezo but you can devide zero to the number");
		}
	}
}
