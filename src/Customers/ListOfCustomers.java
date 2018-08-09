package Customers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfCustomers  {
	private ArrayList<Customer> list = new ArrayList<Customer>();

//конструктор с аргументами переменной длины	
	public ListOfCustomers(Customer... customers) {
		for (Customer c : customers) {
			list.add(c);
		}
	}

// метод, выводящий в консоль список кастомеров по алфавиту
	public void filterByAlfabetOrder() {
		Collections.sort(list);
		
	}
	
	public void show() {
		for(Customer c : list) {
			System.out.println(c.toString());
		}
	}
	
	
	
}
