package Lesson35;


public class Main {
	public static void main(String[] args) {
        Less35<Integer, String> aa = new Less35<>(10, "Hello");

        System.out.println("Item 1: " + aa.getItem()); 
        System.out.println("Item 2: " + aa.getItem2()); 

        aa.setItem(20, "World");

        // Get and print the updated items
        System.out.println("Updated Item 1: " + aa.getItem());  
        System.out.println("Updated Item 2: " + aa.getItem2()); 
	}
}
