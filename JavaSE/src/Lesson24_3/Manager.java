package Lesson24_3;

class Manager extends Employee {
	int teamSize;

	public Manager(String name, String position, int teamSize) {
		super(name, position);
		this.teamSize = teamSize;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Размер команды: " + teamSize);
	}
}
