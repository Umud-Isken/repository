package Lesson47;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.VoiceStatus;

public class TaskMeneger {
	private ArrayList<Task> tasks =new ArrayList<Task>();
	public void addTask(Task task) {
		tasks.add(task);
	}
	
	public void removeTask(int id) {
		tasks.remove(id);
	}
	
	public void allTasks() {
		for (Task task:tasks) {
			System.out.println(task.toString());
		}
	}
	
	public void markAsCompleted(int id) {
		for (Task task : tasks) {
			if (task.getId()==id) {
				task.markAsCompleted();
				return;
			}
		}
	}
}
