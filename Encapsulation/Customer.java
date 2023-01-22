
public class Customer {

	private String firstName;
	private String lastName;
	private long accountNo;
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setAccountNo(long accountNo){
		this.accountNo = accountNo;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public long getAccountNo(){
		return accountNo;
	}
}
