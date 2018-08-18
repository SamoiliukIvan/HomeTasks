package Buses;

/*Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута,
Марка, Год начала эксплуатации, Пробег.
Создать массив объектов. Вывести:
a) список автобусов для заданного номера маршрута;
b) список автобусов, которые эксплуатируются больше заданного срока;
c) список автобусов, пробег у которых больше заданного расстояния.*/
import java.util.ArrayList;

import Cars.Car;

public class ListOfBuses {
	private ArrayList<Bus> list = new ArrayList<Bus>();

// конструктор с аргументами переменной длины
	public ListOfBuses(Bus... buses) {
		for (Bus b : buses) {
			list.add(b);
		}
	}

	public void show() {
		for (Bus b : list) {
			System.out.println(b.toString());
		}
	}

// метод для вывода списка автобусов для заданного номера маршрута
	public void filterByRouteNumber(String routeNumber) {
		for (Bus b : list) {
			if (b.getNumberOfRout().equals(routeNumber)) {
				System.out.println(b.toString());
			}
		}
	}

// метод для вывода списка автобусов, которые эксплуатируются больше заданного срока
	public void filterByTime(int year) {
		for (Bus b : list) {
			if (b.getYear() > year) {
				System.out.println(b.toString());
			}
		}
	}

// метод для вывода списка автобусов, пробег у которых больше заданного расстояния
	public void filterByTime(double mileage) {
		for (Bus b : list) {
			if (b.getMileage() > mileage) {
				System.out.println(b.toString());
			}
		}
	}
}
