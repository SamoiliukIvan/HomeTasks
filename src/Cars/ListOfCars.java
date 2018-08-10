package Cars;

import java.time.LocalDate;
import java.util.ArrayList;

import Books.Book;
import Customers.Customer;

public class ListOfCars {
	private ArrayList<Car> list = new ArrayList<Car>();

// конструктор с аргументами переменной длины
	public ListOfCars(Car... cars) {
		for (Car c : cars) {
			list.add(c);
		}
	}

	public void show() {
		for (Car c : list) {
			System.out.println(c.toString());
		}
	}

// метод для вывода списка автомобилей заданной марки
	public void filterByBrand(String brand) {
		for (Car c : list) {
			if (c.getBrand().equals(brand)) {
				System.out.println(c.toString());
			}
		}
	}
//	метод для вывода списка автомобилей заданной модели, которые эксплуатируются больше n лет
	public void filterByBrandAndYear(String brand, int years) {
		for (Car c : list) {
			if (c.getBrand().equals(brand) && (c.getYear() < LocalDate.now().getYear() - years)) {
				System.out.println(c.toString());
			}
		}
	}
	
//	метод для вывода списка автомобилей заданного года выпуска, цена которых больше указанной
	public void filterByYearAndPrice(int years, double price) {
		for (Car c : list) {
			if(c.getYear() == years && c.getPrice() > price) {
				System.out.println(c.toString());
			}
		}
	}	
	
}
