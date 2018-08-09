package Customers;

public class Customer implements Comparable<Customer> {
	static int id;
	private String name;
	private String secondName;
	private String lastName;
	private String address;
	private String creditCardNumber;
	private String accountNumber;
	
	
public Customer(String name, String secondName, String lastName, String address, String creditCardNumber,
			String accountNumber) {
		id++;
		this.name = name;
		this.secondName = secondName;
		this.lastName = lastName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.accountNumber = accountNumber;
	}
// геттеры и сеттеры
public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Customer.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
// переопределенный метод toString()
	@Override
	public String toString() {
		return name + secondName + lastName + ". Адрес: "
				+ address + ". Credit card #: " + creditCardNumber + ". Account # " + accountNumber;
	}
//переопределенный метод compareTo()
@Override
public int compareTo( Customer o) {
	
	return this.getLastName().compareTo(o.getLastName());
}


}
