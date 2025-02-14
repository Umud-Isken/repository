package Lesson28_new_format;

import java.util.Scanner;

public class Circle implements Shape{
	@Override
	public void s(double a) {
		double resultS = a *a;
		System.out.println(resultS);
	}
	
	public void p(double b) {
		double ResultP = b*2;
		System.out.println(ResultP);
	}
	

}
