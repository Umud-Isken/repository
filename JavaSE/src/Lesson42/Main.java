package Lesson42;

public class Main {
	public static void main(String[] args) {
		Thread music2= new Thread(new music());
		music2.start();
		
		Youtube youtube =new Youtube();
		youtube.start();
	}
}
