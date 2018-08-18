package Airlines;

import java.time.LocalTime;
import java.util.ArrayList;

import Buses.Bus;

public class ListOfAirlines {
	private ArrayList<Airline> list = new ArrayList<Airline>();

// конструктор с аргументами переменной длины
	public ListOfAirlines(Airline... airlines) {
		for (Airline a : airlines) {
			list.add(a);
		}
	}

	public void show() {
		for (Airline a : list) {
			System.out.println(a.toString());
		}
	}

// метод для вывода списка рейсов для заданного пункта назначения
	public void filterByDestination(String destination) {
		for (Airline a : list) {
			if (a.getDestination().equals(destination)) {
				System.out.println(a.toString());
			}
		}
	}

// метод для вывода списка рейсов для заданного дня недели
	public void filterByDayOfWeek(DayOfWeek dayOfWeek) {
		for (Airline a : list) {
			if (a.getDaysOfWeek().equals(dayOfWeek)) {
				System.out.println(a.toString());
			}
		}
	}

// метод для вывода списка рейсов для заданного дня недели, время вылета для которых больше заданного
	public void filterByDayOfWeekAndTime(DayOfWeek dayOfWeek, int hour, int minute) {
		for (Airline a : list) {
			if (a.getDaysOfWeek().equals(dayOfWeek) && a.getTime().compareTo(LocalTime.of(hour, minute)) > 0) {
				System.out.println(a.toString());
			}
		}
	}
}
