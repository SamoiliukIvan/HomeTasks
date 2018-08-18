package Students;
import java.util.ArrayList;

import Customers.Customer;

public class ListOfStudents {
	private ArrayList <Student> list  = new ArrayList<Student>();
	
// конструктор с аргументами переменной длины	
	public ListOfStudents(Student... students) {
		for(Student s : students) {
			list.add(s);
		}
	}
// метод, выводящий в консоль студентов, отфильтрованных по факультету
	public void filterByFaculty (String facultyName) {
		for(Student s : list) {
			if(s.getFaculty().equals(facultyName))
				System.out.println(s.getName());
		}
	}
	
	/*public void filterByFacultyAndCourse() {
		for(Student s : list) {
			if())
		}
	}*/
// метод, выводящий в консоль список студентов, родившихся после указанного года	
	public void filterByYears(int yyyy) {
		for(Student s : list) {
			if(s.getDayOfBirthday().getYear() > yyyy) {
				System.out.println(s.getLastName());
			}
		}
	}
// метод, выводящий в консоль список студентов группы
	public void filterByGroup(String faculty, int course, int group) {
		for(Student s : list) {
			if(s.getFaculty().equals(faculty) && s.getCourse() == course && s.getGroup() == group) {
				System.out.println(s.getLastName());
			}
		}
	}
	
	public void filterByLastnames() {
		
	}
	
	public void filterByCreditcardNumber(int begin, int end) {
		for(Student s : list) {
			Integer temp = Integer.parseInt(s.getPhoneNumber());
			if(begin < temp && temp < end) {
				System.out.println(s.toString());
			}
		}
	}
}
