package Products;

import java.time.LocalDate;

public class Product {
	static int id;
	private String name;
	private Long UPC;
	private String manufacturer;
	private Double price;
	private LocalDate expirationDate; // срок хранения
	private Long count;
// конструктор
	public Product(String name, Long uPC, String manufacturer, Double price, int year, int month, int dayOfMonth, Long count) {
		id++;
		this.name = name;
		UPC = uPC;
		this.manufacturer = manufacturer;
		this.price = price;
		expirationDate = LocalDate.of(year, month, dayOfMonth);
		this.count = count;
	}
// 	геттеры и сеттеры
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getUPC() {
		return UPC;
	}
	public void setUPC(Long uPC) {
		UPC = uPC;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(int year, int month, int dayOfMonth) {
		this.expirationDate = LocalDate.of(year, month, dayOfMonth);
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public static int getId() {
		return id;
	}
//переопределенный метод toString()	
	@Override
	public String toString() {
		return getId() + ". " + getName() + ". " + getUPC() + ". " + getManufacturer()
				+ ". " + getPrice() + ". " + getExpirationDate() + ". "
				+ getCount();
	}

}
