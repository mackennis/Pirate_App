
public class Customer {

	protected String firstName;
	protected String lastName;
	protected String address;
	protected String state;
	protected int zip;
	protected long phoneNum;
	protected String email;
	
	//********************************************Constructor
	public Customer() {
		firstName = "Set First Name";
		lastName = " Set Last Name";
		address = "Set Address";
		zip = 11111;
		phoneNum = 1111111111;
		email = "Set Email";	
	}
	
	//********************************************Getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getState() {
		return state;
	}
	public int getZip() {
		return zip;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public String getEmail() {
		return email;
	}

	
	//**********************************************Setters
	public void setFirstName(String s) {
		firstName = s;
	}
	public void setLastName(String s) {
		lastName = s;
	}
	public void setAddress(String s) {
		address = s;
	}
	public void setState(String s) {
		state = s;
	}
	public void setZip(int i) {
		zip = i;
	}
	public void setPhoneNum(long i) {
		phoneNum = i;
	}
	public void setEmail(String s) {
		email = s;
	}
	
	//**********************************************other
	public String toString() {
		String st = this.getFirstName() + " " + this.getLastName() + '\n' +
					this.getAddress() + '\n' + 
					this.getState() + " " + this.getZip() + '\n' +
					this.getPhoneNum() + '\n' + 
					this.getEmail() + '\n';
		
		return st;
	}
	
}
