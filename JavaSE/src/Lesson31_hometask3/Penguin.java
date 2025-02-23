package Lesson31_hometask3;

public class Penguin extends Bird{
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Penguin cannot fly");
	}
}
