package ems;

public class Tester extends Employee {

	public String tools[];
	public Tester(int id, String name, String dept, double salary, String tools[]) {
		super(id, name, dept, salary);
		System.out.println("Inside Tester constructor");
		this.tools = tools;
	}
	
	@Override
	protected void work(){
		super.work();
		System.out.println("Tester is testing using ");
		for(String tool : tools){
			System.out.println(tool);
		}
	}

}
