package NewYearGift;

import java.util.ArrayList;

import Cars.Car;

public class ListOfSweets {
	ArrayList<Sweets> list = new ArrayList<>();

	public ListOfSweets(Sweets... sweetss) {
		for (Sweets s : sweetss) {
			list.add(s);
		}
	}
// метод для вывода списка
	public void show() {
		for (Sweets s : list) {
			System.out.println(s.toString());
		}
	}
// метод для определения уровня сахара
	public void filtelByLevelOfSugar(double min, double max) {
		for (Sweets s : list) {
			if (s.levelOfSugar > min && s.levelOfSugar < max) {
				System.out.println(s.levelOfSugar);
			}
		}
	}
}
