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
		for(Customer c : list) {
			System.out.println(c.toString());
		}
	}
// метод, выводящий в консоль список кастомеров, у которых номер кредитной карты в заданном диапазоне	
	public void filterByCreditcardNumber(int begin, int end) {
		for(Customer c : list) {
			if(begin < c.getCreditCardNumber() && c.getCreditCardNumber() < end) {
				System.out.println(c.toString());
			}
		}
	}
	
	public void show() {
		for(Customer c : list) {
			System.out.println(c.toString());
		}
	}
	
	
	
}
