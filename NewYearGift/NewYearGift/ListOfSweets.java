package NewYearGift;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Cars.Car;

public class ListOfSweets {
	ArrayList<Sweet> list = new ArrayList<>();

	public ListOfSweets(Sweet... sweets) {
		for (Sweet s : sweets) {
			list.add(s);
		}
	}

	Sweet[] arrayOfSweet = list.toArray(new Sweet[list.size()]);

// метод для вывода списка
	public void show() {
		for (Sweet s : list) {
			System.out.println(s.toString());
		}
	}

// метод для определения сладостей по уровню сахара в заданном диапазоне
	public void filtelByLevelOfSugar(double min, double max) {
		for (Sweet s : list) {
			if (s.getLevelOfSugar() > min && s.getLevelOfSugar() < max) {
				System.out.println(s.getLevelOfSugar());
			}
		}
	}

// сортировка по цене
	public void sortByPrice() {
		ArrayList<Sweet> a = (ArrayList<Sweet>) list.stream().sorted((s1, s2) -> s1.getPrice().compareTo(s2.getPrice()))
				.collect(Collectors.toList());

		for (Sweet s : a) {
			System.out.println(s.toString());
		}
	}

// сортировка по уровню сахара
	public void sortBySugar() {
		ArrayList<Sweet> a = (ArrayList<Sweet>) list.stream()
				.sorted((s1, s2) -> s1.getLevelOfSugar().compareTo(s2.getLevelOfSugar())).collect(Collectors.toList());

		for (Sweet s : a) {
			System.out.println(s.toString());
		}
	}

// сортировка по весу
	public void sortByWeight() {
		ArrayList<Sweet> a = (ArrayList<Sweet>) list.stream()
				.sorted((s1, s2) -> s1.getweight().compareTo(s2.getweight())).collect(Collectors.toList());

		for (Sweet s : a) {
			System.out.println(s.toString());
		}
	}
// суммарный вес подарка
	public void getWeightOfGift() {
		double sum = 0.0;
		for(Sweet s : list) {
			sum += s.getweight();
		}
		System.out.println(sum + " грамм");
	}
}
