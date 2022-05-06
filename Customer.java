
package crudapplication;

public class Customer {
	private int customerID;
	private String customername;
	private String customeremail;
	private String password;

	public Customer(int customerID, String customername, String customeremail, String password) {
		super();
		this.customerID = customerID;
		this.customername = customername;
		this.customeremail = customeremail;
		this.password = password;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getPassword() {
		return password;
	}

	public int getCustomerID() {
		return getCustomerID();
	}

	public void setPassword(String password) {
		this.password=password;
	}

	public String toString() {
return getCustomername() + " " + customerID + " " + customeremail + "+password";
}
}

