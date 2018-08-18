package Students;
import java.time.*;
public class Student implements Comparable<Student>{
	static int id;
	private String name;
	private String secondName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String faculty;
	private int course;
	private int group;
	private LocalDate dayOfBirthday;
	
	public Student() {
		id++;
	}
	
	public Student(Person person, String address, String phoneNumber, String faculty, int course, int group, int day, int month, int year) {
		id++;
		name = person.getName();
		secondName = person.getSecondName();
		lastName = person.getLastName();
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.faculty = faculty;
		this.course = course;
		this.group = group;
		dayOfBirthday = LocalDate.of(year, month, day);
	}
// геттеры
	public static int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getSecondName() {
		return secondName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getFaculty() {
		return faculty;
	}
	public int getCourse() {
		return course;
	}
	public int getGroup() {
		return group;
	}
	public LocalDate getDayOfBirthday() {
	return dayOfBirthday;
	}
// сеттеры
	public static void setId(int id) {
		Student.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public void setDayOfBirthday(int dd, int mm, int yyyy) {
		this.dayOfBirthday = LocalDate.of(yyyy, mm, dd);
	}

	
	@Override
	public String toString() {
		return name + " " +secondName + " " + lastName + ". Adress: "
				+ address + ". Phone Number: " + phoneNumber + ". Fuculty" + faculty + ". Course: " + course + ". Group: "
				+ group + ". Day of birthday: " + dayOfBirthday;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.lastName.compareTo(o.getLastName());
	}
	
	
	
	
	

}
