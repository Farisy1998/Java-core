
public class OverrideingTest {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.fuel());
		Bus bus = new Bus();
		System.out.println(bus.fuel());
		Bike bike= new Bike();
		System.out.println(bike.fuel());
	}
}
