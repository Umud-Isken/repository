package Lesson26_hometask1;

public class Main {
	public static void main(String[] args) {
		Book book = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
		Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);
		System.out.println(book.toString());
		System.out.println(book.equals(book)); 
		System.out.println(book.equals(book2)); 
	}
}
