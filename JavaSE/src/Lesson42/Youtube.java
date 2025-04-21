package Lesson42;

import java.util.Iterator;

public class Youtube extends Thread {
	public void run() {
		for (int i = 1; i <= 10;i++) {
			System.out.println("Ктото смотрит в YouTube" + i);
		try {
			Thread.sleep(2200);
		} catch (Exception e) {
	
		}}
	}
}
