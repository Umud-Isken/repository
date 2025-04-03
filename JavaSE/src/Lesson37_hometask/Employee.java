package Lesson37_hometask;


public class Employee implements Comparable<Employee> {
	String iD;
	int salary;

	public Employee(String iD, int salary) {
		this.iD = iD;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.salary - o.salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "iD='" + iD + '\'' + ", salary=" + salary + '}';
	}
}
