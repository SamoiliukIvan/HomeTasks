package Books;

import java.util.ArrayList;

import Customers.Customer;

public class ListOfBooks {
	ArrayList<Book> list = new ArrayList<Book>();
// конструктор
	public ListOfBooks(Book... books) {
		for (Book b : books) {
			list.add(b);
		}
	}
// метод для вывода списка на консоль
	public void show() {
		for (Book b : list) {
			System.out.println(b.toString());
		}
	}
// метод для вывода списка книг заданного автора
	public void filterByAuthor(String author) {
		for(Book b : list) {
			if(b.getAuthors().equals(author)) {
				System.out.println(b.toString());
			}
		}
	}
// метод для вывода списка книг, выпущенных заданным издательством
	public void filteByPublishingHouse(String pHouse) {
		for(Book b : list) {
			if(b.getPublishingHouse().equals(pHouse)) {
				System.out.println(b.toString());
			}
		}
	}
// метод для вывода списка книг, выпущенных после заданного года
	public void filterByYear(int yearOfEdition) {
		for(Book b : list) {
			if(yearOfEdition < b.getYearOfEdition()) {
				System.out.println(b.toString());
			}
		}
	}

}
