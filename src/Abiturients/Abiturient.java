package Abiturients;

public class Abiturient {
	static int id;
	private String name;
	private String secondName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private int assessmentOfMath;
	private int assessmentOfUkr;
// конструктор	
	public Abiturient(String name, String secondName, String lastName, String address, String phoneNumber, int assessmentOfMath, int assessmentOfUkr) {
		super();
		this.name = name;
		this.secondName = secondName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.assessmentOfMath = assessmentOfMath;
		this.assessmentOfUkr = assessmentOfUkr;
	}
// геттеры и сеттеры
	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Abiturient.id = id;
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
public int getAssessmentOfMath() {
		return assessmentOfMath;
	}
	public void setAssessmentOfMath(int assessment) {
		this.assessmentOfMath = assessment;
	}
	public int getAssessmentOfUkr() {
		return assessmentOfUkr;
	}
	public void setAssessmentOfUkr(int assessmentOfUkr) {
		this.assessmentOfUkr = assessmentOfUkr;
	}
	// переопределенный метод toString()	
	@Override
	public String toString() {
		return  getId() + " " + getName() + " " + getSecondName() + " " + getLastName() + ". Address: " + getAddress() + ". Tel: " + getPhoneNumber() + ". Assessment of Math: " + getAssessmentOfMath() + ". Assessment of Ukr" + getAssessmentOfUkr();
	}
	

	
}
