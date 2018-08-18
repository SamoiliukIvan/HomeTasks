package Patients;

public class RunnerPatients {
	public static void main(String[] args) {
		ListOfPatients list = new ListOfPatients(
				new Patient("Ivan", "Evg", "Sam", "dfgdf", "54564654", 15454L, Diagnosis.FLU), 
				new Patient("Jo", "Evg", "Sam", "dfgdf", "1111154", 111454L, Diagnosis.ANGINA), 
				new Patient("Be", "Evg", "Sam", "dfgdf", "222222", 22224L, Diagnosis.FLU));
		list.filterByDiagnosis(Diagnosis.FLU);
		System.out.println();
		list.filterByMedicCardNumber(5254L, 45754L);
	}

	
	
}
