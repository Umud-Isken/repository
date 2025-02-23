package Lesson31_hometask2;

public class Rectangle implements shape{
	private double width,height;
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public double area() {
		return width * height;
	}
}
