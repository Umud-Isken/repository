package Lesson27;

public class Car extends Transport{
	@Override
	void start() {
		System.out.println("Машина стартует");
	}
	void stop() {
		System.out.println("Машина остонавливаеться");
	}
}
