package Books;

import java.time.LocalDate;

public class Book {
	static int id;
	private String nameOfBook;
	private String authors;
	private String publishingHouse; // издательство
	private int yearOfEdition;
	private Integer countOfPapers;
	private Double price;
	private TypeOfBinding type; // тип переплета
// конструктор	

	public Book(String nameOfBook, String authors, String publishingHouse, int yearEdition,
			Integer countOfPapers, Double price, TypeOfBinding type) {
		id++;
		this.nameOfBook = nameOfBook;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.yearOfEdition = yearOfEdition;
		this.countOfPapers = countOfPapers;
		this.price = price;
		this.type = type;
		this.yearOfEdition = yearEdition;
	}

// геттеры и сеттеры	
	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Book.id = id;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearOfEdition() {
		return yearOfEdition;
	}

	public void setYearOfEdition(int yearOfEdition) {
		this.yearOfEdition = yearOfEdition;
	}

	public Integer getCountOfPapers() {
		return countOfPapers;
	}

	public void setCountOfPapers(Integer countOfPapers) {
		this.countOfPapers = countOfPapers;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public TypeOfBinding getType() {
		return type;
	}

	public void setType(TypeOfBinding type) {
		this.type = type;
	}
// переопределенный метод toString()
	@Override
	public String toString() {
		return getId() + ". " + getNameOfBook() + ". " + getAuthors() + ". "
				+ getPublishingHouse() + ". " + getYearOfEdition() + ". "
				+ getCountOfPapers() + ". " + getPrice() + ". " + getType();
	}

	
}
