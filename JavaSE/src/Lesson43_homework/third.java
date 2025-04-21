package Lesson43_homework;

public class third extends Thread{
	public void run() {
	        while (true) {
	            System.out.println("Покупаю попкорн");
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }


}
