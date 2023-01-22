package ems;

public class Manager extends Employee {
	
	public String projects[];

	public Manager(int id, String name, String dept, double salary, String projects[]) {
		super(id, name, dept, salary);
		System.out.println("Inside Manager constructor");
		this.projects = projects;
	}

	// Final methods cannot be over ridden
	@Override
	protected void work(){
		super.work();
		System.out.println("Manager is managing on: ");
		for(String project : projects){
			System.out.println(project);
		}
	}
}
