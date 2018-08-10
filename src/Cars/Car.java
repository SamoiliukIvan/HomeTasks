package Cars;

public class Car {
	
	static int id;
	private String brand;
	private String model;
	private Integer year;
	private Color color;
	private Double price;
	private String regestryNumber;
//конструктор
	public Car(String brand, String model, Integer year, Color color, Double price, String regestryNumber) {
		id++;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.regestryNumber = regestryNumber;
	}
// геттеры и сеттеры
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getRegestryNumber() {
		return regestryNumber;
	}
	public void setRegestryNumber(String regestryNumber) {
		this.regestryNumber = regestryNumber;
	}
	public static int getId() {
		return id;
	}
// переопределенный метод toString()	
	@Override
	public String toString() {
		return getId() + ". " + getBrand() + ". " + getModel() + ". " + getYear()
				+ ". " + getColor() + ". " + getPrice() + ". "
				+ getRegestryNumber();
	}
	

	
	

	
	
	
}
