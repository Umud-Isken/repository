package Lesson28_hometask2;

public class Bicycle implements Vehicle{
	@Override
	public void start() {
		System.out.println("Велик начинает свое движение");
	}
	@Override
	public void stop() {
		System.out.println("велик Остановился");
	}
}
