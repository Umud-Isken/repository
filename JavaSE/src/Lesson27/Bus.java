package Lesson27;

public class Bus extends Transport {
	@Override
	void start() {
		System.out.println("Bus start");
	}
	void stop() {
		System.out.println("Bus stop");
	}
}
