
public class MultiLevelTest {

	public static void main(String[] args) {
		Child child = new Child(); // Although, both the parent and child class shares 
		// the same object or memory location. 
		child.f1();
		child.f2();
	}

}
