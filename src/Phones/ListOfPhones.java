package Phones;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

import Customers.Customer;

public class ListOfPhones {
	private ArrayList<Phone> list = new ArrayList<Phone>();

//конструктор с аргументами переменной длины	
		public ListOfPhones(Phone...phones) {
			for (Phone c : phones) {
				list.add(c);
			}
		}
		
		public void show() {
			for(Phone p : list) {
				System.out.println(p.toString());
			}
		}
// метод для вывода сведений об абонентах, у которых время внутригородских разговоров
// превышает заданное;
		public void filterByLocasCalls(int hours, int minutes, int seconds) {
			for(Phone p : list) {
				if(p.getLocalCalls().compareTo(LocalTime.of(hours, minutes, seconds)) > 1) {
					System.out.println(p.toString());
				}
			}
		}
// метод для вывода сведений об абонентах, которые пользовались междугородной связью;
		public void filterByUsingOfLDCalls() {
			for(Phone p : list) {
				if(p.getLongDistanceCalls().compareTo(LocalTime.of(0, 0, 0)) != 0) {
					System.out.println(p.toString());
				}
			}
		}
// метод для вывода сведений об абонентах в алфавитном порядке
		public void filterByAlfabet() {
			Collections.sort(list);
			for(Phone p : list) {
				System.out.println(p.toString());
			}
		}
}

