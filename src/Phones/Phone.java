package Phones;

import java.time.LocalTime;

public class Phone implements Comparable<Phone>{
	static int id;
	private String name;
	private String secondName;
	private String lastName;
	private String address;
	private Long creditCardNumber;
	private Double debit;
	private Double credit;
	private LocalTime localCalls;
	private LocalTime longDistanceCalls;
// конструктор	
	public Phone(String name, String secondName, String lastName, String address, Long creditCardNumber, Double debit,
			Double credit, int hoursLC, int minutesLC, int secondsLC, int hoursLDC, int minutesLDC, int secondsLDC) {
		id++;
		this.name = name;
		this.secondName = secondName;
		this.lastName = lastName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.debit = debit;
		this.credit = credit;
		localCalls = LocalTime.of(hoursLC, minutesLC, secondsLC);
		longDistanceCalls = LocalTime.of(hoursLDC, minutesLDC, secondsLDC);
	}
// геттеры и сеттеры
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
	public Long getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(Long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public Double getDebit() {
		return debit;
	}
	public void setDebit(Double debit) {
		this.debit = debit;
	}
	public Double getCredit() {
		return credit;
	}
	public void setCredit(Double credit) {
		this.credit = credit;
	}
	public LocalTime getLocalCalls() {
		return localCalls;
	}
	public void setLocalCalls(int hours, int minutes, int seconds) {
		this.localCalls = LocalTime.of(hours, minutes, seconds);
	}
	public static int getId() {
		return id;
	}
public LocalTime getLongDistanceCalls() {
		return longDistanceCalls;
	}
	public void setLongDistanceCalls(int hours, int minutes, int seconds) {
		this.longDistanceCalls = LocalTime.of(hours, minutes, seconds);
	}
	// переопределенный метод toString()
	@Override
	public String toString() {
		return getId() + ". " + getName() + ". " + getSecondName() + ". "
				+ getLastName() + ". " + getAddress() + ". " + getCreditCardNumber()
				+ ". " + getDebit() + ". " + getCredit() + ". " + getLocalCalls();
	}
// переопределенный метод compareTo()
	@Override
	public int compareTo(Phone o) {
		return this.getLastName().compareTo(o.getLastName());
	}
}
