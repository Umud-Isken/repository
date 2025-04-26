package Lesson47;

public class Task {
	private static int counter =0;
	private int id;
	private String title;
	private String deskcription;
	private boolean isCompleted;
	
	public Task(String title, String deskcription) {
		this.id = counter++;
		this.title = title;
		this.deskcription = deskcription;
		this.isCompleted = false;
	}
	
	public int getId() {
		return id;
	}
	
	public void markAsCompleted() {
		this.isCompleted = true;
	}
	
	public boolean IsCompleted(){
		return isCompleted;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", deskcription=" + deskcription + ", isCompleted=" + isCompleted
				+ "]";
	}
	
	
	
}
