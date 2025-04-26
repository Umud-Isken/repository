package Lesson47;


public class Main {
	public static void main(String[] args) {
		TaskMeneger manager =new TaskMeneger();
		Task task1 = new Task("Java", "addArrayList");
		Task task2 = new Task("Java", "removeArrayList");
		Task task3 = new Task("Java", "HashMap");
		
		manager.addTask(task1);
		manager.addTask(task2);
		manager.addTask(task3);
		
		manager.allTasks();
		
		manager.removeTask(2);
		manager.allTasks();
		
		manager.markAsCompleted(0);
		manager.allTasks();
		
	}
}
