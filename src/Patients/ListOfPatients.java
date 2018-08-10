package Patients;

import java.util.ArrayList;

public class ListOfPatients {
	private ArrayList<Patient> list = new ArrayList<Patient>();

// конструктор с аргументами переменной длины	
	public ListOfPatients(Patient... patients) {
		for (Patient p : patients) {
			list.add(p);
		}
	}
// метод, выводящий на консоль список пациентов в заданным диагнозом
	public void filterByDiagnosis(Diagnosis diagnosis) {
		for(Patient p : list) {
			if (p.getDiagnosis().equals(diagnosis)) {
				System.out.println(p.toString());
			}
		}
	}
	// метод, выводящий на консоль список пациентов, номер медкарты которых, находится в заданном интервале
	public void filterByMedicCardNumber(Long begin, Long end) {
		for(Patient p : list) {
			if(begin < p.getMedicCardNumber() && p.getMedicCardNumber() < end) {
				System.out.println();
			}
		}
	}

}
