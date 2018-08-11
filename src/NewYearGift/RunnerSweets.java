package NewYearGift;

import java.util.ArrayList;
import java.util.Collections;

import Students.ListOfStudents;

public class RunnerSweets {

	public static void main(String[] args) {
		ArrayList<Sweets> list  = new ArrayList<Sweets>();
		Alenka s1 = new Alenka(58.0, 12.28, 60.0, LevelOfChocolate.FROM_35_TO_40, Nuts.HAZELNUTS, true);
		Sweets s2 = new RoshenDark(52.0, 12.7, 128.2, LevelOfChocolate.MORE_THEN_50, Nuts.WITHOUT_NUTS, true);
		Karakum s3 = new Karakum(24.25, 129.25, 16.5, FillingOfSweets.CHOCOLATE, LevelOfChocolate.FROM_35_TO_40);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
// уровень цены по возрастанию
		Collections.sort(list);
		for(Sweets s : list) {
			System.out.println(s.price);
		}
// вес подарка

		
	}
}

