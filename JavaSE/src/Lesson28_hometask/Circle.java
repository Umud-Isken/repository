package Lesson28_hometask;


public class Circle implements Shape{
	@Override
	public void area(double area){
		System.out.println("Площaдь круга: " + area);
	}
	@Override
	public void perimeter(double perimeter) {
		System.out.println("Периметр круга");
	}
	
	
}
