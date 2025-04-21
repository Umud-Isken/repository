package Lesson43_hometask2;

public class Vacuming extends Thread{
	@Override
	public void run() {
		System.out.println("Vacuming");
	}
	
    public static void main(String[] args) {
    	Vacuming vacuuming = new Vacuming();
        vacuuming.setName("Пылесосить");
        vacuuming.setPriority(Thread.MIN_PRIORITY); 
        vacuuming.start();
    }
}
