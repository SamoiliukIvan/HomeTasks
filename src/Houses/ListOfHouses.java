package Houses;

import java.util.ArrayList;

public class ListOfHouses {
	ArrayList<House> list = new ArrayList<House>();

// конструктор
	public ListOfHouses(House... houses) {
		for (House h : houses) {
			list.add(h);
		}
	}

// метод для вывода списка на консоль
	public void show() {
		for (House h : list) {
			System.out.println(h.toString());
		}
	}

// метод для вывода списка квартир, имеющих заданное число комнат;
	public void filterByCountOfRooms(int countOfRooms) {
		for (House h : list) {
			if (h.getCountOfRooms().ordinal() == countOfRooms) {
				System.out.println(h.toString());
			}
		}
	}

// метод для вывода списка квартир, имеющих заданное число комнат и расположенных
// на этаже, который находится в заданном промежутке;
	public void filterByCountOfRoomsAndFloor(int countOfRooms, int minFloor, int maxFloor) {
		for (House h : list) {
			if (h.getCountOfRooms().ordinal() == countOfRooms - 1
					&& (h.getFloor().ordinal() > minFloor - 1 && h.getFloor().ordinal() < maxFloor - 1)) {
				System.out.println(h.toString());
			}
		}
	}

// метод для вывода списка квартир, имеющих площадь, превосходящую заданную
	public void filterBySquare(double square) {
		for (House h : list) {
			if (h.getSquare() > square) {
				System.out.println(h.toString());
			}
		}
	}
}
