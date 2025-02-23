package Lesson31_hometask2;

public class Circle implements shape{
	private  double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double area() {
		return Math.PI * radius * radius;
	}
}
