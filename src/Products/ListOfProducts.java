package Products;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListOfProducts {
	ArrayList<Product> list = new ArrayList<Product>();

// конструктор
	public ListOfProducts(Product... product) {
			for (Product p : product) {
				list.add(p);
			}
		}

// метод для вывода списка на консоль
	public void show() {
		for (Product p : list) {
			System.out.println(p.toString());
		}
	}

// метод для вывода списка товаров для заданного наименования
	public void filterByNames(String name) {
		for (Product p : list) {
			if (p.getName().equals(name)) {
				System.out.println(p.toString());
			}
		}
	}

// метод для вывода списка товаров для заданного наименования, цена которых не превосходит заданную
	public void filterByNames(String name, double price) {
		for (Product p : list) {
			if (p.getName().equals(name) && p.getPrice() < price) {
				System.out.println(p.toString());
			}
		}
	}

// метод для вывода списка товаров, срок хранения которых больше заданного
	public void filterByExpirationDate(int year, int month, int dayOfMonth) {
		for (Product p : list) {
			if (p.getExpirationDate().compareTo(LocalDate.of(year, month, dayOfMonth)) > 0) {
				System.out.println(p.toString());
			}

		}

	}
}
