
public class TestPatient {

	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.setId(001);
		patient.setName("George");
		patient.setSsn("HJKI235");
		
		System.out.println(patient.getId());
		System.out.println(patient.getName());
		System.out.println(patient.getSsn());
	}

}
