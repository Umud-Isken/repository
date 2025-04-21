package Lesson43_homework;

public class second extends Thread{
	   public void run() {
	        while (true) {
	            System.out.println("Покупаю билет");
	            try {
	                Thread.sleep(1500); 
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
