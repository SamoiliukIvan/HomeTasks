package Buses;

public class Bus {
	private String lastName;
	private String name;
	private String secondName;
	private int number;
	private String numberOfRout;
	private String Brand;
	private int year;
	private Double mileage; // пробег
// конструтор

	public Bus(String lastName, String name, String secondName, int number, String numberOfRout, String brand, int year,
			Double mileage) {
		super();
		this.lastName = lastName;
		this.name = name;
		this.secondName = secondName;
		this.number = number;
		this.numberOfRout = numberOfRout;
		Brand = brand;
		this.year = year;
		this.mileage = mileage;
	}

// геттеры и сеттеры
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getNumberOfRout() {
		return numberOfRout;
	}

	public void setNumberOfRout(String numberOfRout) {
		this.numberOfRout = numberOfRout;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Double getMileage() {
		return mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return getLastName() + " " + getName() + " "
				+ getSecondName() + ". " + getNumber() + ". " + getNumberOfRout()
				+ ". " + getBrand() + ". " + getYear() + ". " + getMileage();
	}

}
