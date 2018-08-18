package Abiturients;

import java.util.ArrayList;

public class ListOfAbiturients {
	ArrayList<Abiturient> list = new ArrayList<Abiturient>();

// конструктор
	public ListOfAbiturients(Abiturient... abiturients) {

		for (Abiturient a : abiturients) {
			list.add(a);
		}
	}

// метод, выводящий на консоль список абитуриантов с неудовлетворительными оценками
	public void filterByBedAssessment() {
		for (Abiturient a : list) {
			if (a.getAssessmentOfMath() < 3 || a.getAssessmentOfUkr() < 3) {
				System.out.println(a.toString());
			}
		}
	}

// метод выводящий список абитуриентов, суммарная оценка выше заданной
	public void filterBySpecifiedSumAssessment(int assessment) {
		for (Abiturient a : list) {
			if (assessment < a.getAssessmentOfMath() + a.getAssessmentOfUkr()) {
				System.out.println(a.toString());
			}
		}
	}

// метод,выводящий на консоль список абитуриeнтов с самой высокой суммарной оценкой
// порог определяется как коэффициент 0,8, умноженный на заданный максимум	
	public void filterBySpecifiedMaxAssessment(int maxAssessment) {
		for (Abiturient a : list) {
			if (maxAssessment *0.8 < (a.getAssessmentOfMath() + a.getAssessmentOfUkr())) {
				System.out.println(a.toString());
			}
		}
	}
// метод,выводящий на консоль список абитуриeнтов с полупроходной суммарной оценкой
// порог определяется как сумма баллов между коэфф 0,5 и коэфф 0,8, умноженных на максимум
		public void filterByHalfMaxAssessment(int maxAssessment) {
			for (Abiturient a : list) {
				if (maxAssessment * 0.5 < (a.getAssessmentOfMath() + a.getAssessmentOfUkr()) && (a.getAssessmentOfMath() + a.getAssessmentOfUkr()) < maxAssessment * 0.8) {
					System.out.println(a.toString());
				}
			}
		}
}
