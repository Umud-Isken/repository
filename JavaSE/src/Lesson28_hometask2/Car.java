package Lesson28_hometask2;


public class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Машина начинает свое движение");
	}
	
	@Override
	public void stop() {
		System.out.println("машина остонавливаеться");
	}
}
