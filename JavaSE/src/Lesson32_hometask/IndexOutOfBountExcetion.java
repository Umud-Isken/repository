package Lesson32_hometask;


public class IndexOutOfBountExcetion {
	public static void main(String[] args) {
		
		//1-variant
//		try {
//			int[] numbers = {1,2,3};
//			System.err.println(numbers[10]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("Числа выходят за границу массива в int");
//		}
//		
//		try {
//			String[] string = {"Hello"};
//			System.err.println(string[10]);
//		} catch (StringIndexOutOfBoundsException e) {
//			System.err.println("Выходит за границу массива in String");
//		}
		
		
		//2-variant
//		try {
//			int[] numbers = {1,2,3};
//			System.err.println(numbers[10]);
//		} catch (IndexOutOfBoundsException e) {
//			System.err.println("Числа выходят за границу массива в int");
//		}
//		
		try {
			String[] string = {"Hello"};
			System.err.println(string[10]);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Выходит за границу массива in String");
		}
	}
	
}
