package Lesson28_hometask;

public class Rectangle implements Shape{
	@Override
	public void area(double area) {
		System.out.println("Площадь прямоугольника");
	}
	@Override
	public void perimeter(double perimeter) {
		System.out.println("Периметр прямоугольника");
	}
}
