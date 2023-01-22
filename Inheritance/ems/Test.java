package ems;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager(123, "John", "Travel & Tourisum", 100000, new String[]{"Flight Reservation, Check In"});
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();
		
		Developer developer = new Developer(456, "Farisy", "Full Stack", 50000, "Java");
		System.out.println(developer.id);
		System.out.println(developer.name);
		System.out.println(developer.dept);
		System.out.println(developer.salary);
		developer.work();
		
		Tester tester = new Tester(789, "Arun", "Web Development", 35000, new String[]{"Jenkins", "JUnit"});
		System.out.println(tester.id);
		System.out.println(tester.name);
		System.out.println(tester.dept);
		System.out.println(tester.salary);
		tester.work();
	}

}
