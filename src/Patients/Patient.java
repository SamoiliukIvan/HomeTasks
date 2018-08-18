package Patients;

public class Patient {
	static int id;
	private String name;
	private String secondName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private Long medicCardNumber;
	private Diagnosis diagnosis;
	
	public Patient(String name, String secondName, String lastName, String address, String phoneNumber,
			Long medicCardNumber, Diagnosis diagnosis) {
		id++;
		this.name = name;
		this.secondName = secondName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.medicCardNumber = medicCardNumber;
		this.diagnosis = diagnosis;
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Patient.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Long getMedicCardNumber() {
		return medicCardNumber;
	}
	public void setMedicCardNumber(Long medicCardNumber) {
		this.medicCardNumber = medicCardNumber;
	}
	
	public Diagnosis getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		return name + " " + secondName + " " + lastName + ". Аddress: "
				+ address + ". Tel: " + phoneNumber + ". Medicalcard # " + medicCardNumber;
	}
	
}
