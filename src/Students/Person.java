package Students;

public class Person {
	private String name;
	private String secondName;
	private String lastName;
	
// конструкторы
	public Person() {
		
	}
	
	public Person(String name, String secondName, String lastName) {
		this.name = name;
		this.secondName = secondName;
		this.lastName = lastName;		
	}
	
// геттеры
	public String getName() {
		return name;
	}
	public String getSecondName() {
		return secondName;
	}
	public String getLastName() {
		return lastName;
	}
	
// сеттеры
	public void setName(String name) {
		this.name = name;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
