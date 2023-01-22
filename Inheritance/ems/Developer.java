package ems;

public class Developer extends Employee {
	
	public String technology;

	public Developer(int id, String name, String dept, double salary, String technology) {
		super(id, name, dept, salary);
		System.out.println("Inside Developer constructor");
		this.technology = technology;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Developer is working on "+technology);
	}
}
