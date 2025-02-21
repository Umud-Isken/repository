package Lesson30_hometask2;

public class Main {	
	public static void main(String[] args) {
		HelloMessage hello =new HelloMessage();
		GoodbyeMessage  bye =new GoodbyeMessage();
		WelcomeMessage welcome =new WelcomeMessage();
		
		System.out.println(hello.getText());
		System.out.println(bye.getText());
		System.out.println(welcome.getText());
	}
}
