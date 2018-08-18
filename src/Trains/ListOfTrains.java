package Trains;

import java.time.LocalTime;
import java.util.ArrayList;

public class ListOfTrains {

	ArrayList<Train> list = new ArrayList<Train>();

// конструктор
	public ListOfTrains(Train... trains) {
		for (Train t : trains) {
			list.add(t);
		}
	}

// метод для вывода списка на консоль
	public void show() {
		for (Train t : list) {
			System.out.println(t.toString());
		}
	}

// метод для вывода списка поездов, следующих до заданного пункта назначения
	public void filterByDestinations(String destination) {
		for (Train t : list) {
			if (t.getDestination().equals(destination)) {
				System.out.println(t.toString());
			}
		}
	}

// метод для вывода списка поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа;
	public void filterByDestinationsAndTime(String destination, int hours, int minutes) {
		for (Train t : list) {
			if (t.getDestination().equals(destination) && t.getTime().compareTo(LocalTime.of(hours, minutes)) > 0) {
				System.out.println(t.toString());
			}
		}
	}

// метод для вывода списка поездов, отправляющихся до заданного пункта назначени и имеющих общие места
	public void filterByDestinationsAndTime(String destination, int countOfSeats) {
		for (Train t : list) {
			if (t.getDestination().equals(destination) && t.getCountOfSeats() == countOfSeats) {
				System.out.println(t.toString());
			}
		}
	}
}
