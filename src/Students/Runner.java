package Students;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Runner {
	
	

	public static void main(String[] args) {
		
		Student student1 = new Student(new Person ("Irina","Pavlovna","Andreeva"), "st.Lenina, 1", "09615545452", "Economics", 3, 10, 14, 1, 1985);
		Student student2 = new Student(new Person ("Elena","Semenovna","Nesterenko"), "st.Lenina, 5", "09654445582", "FIFA", 3, 7, 28, 2, 1985);
		Student student3 = new Student(new Person ("Olga","Ivanovna","Ivanchenko"), "st.Lenina, 10", "09615545789", "Economics", 3, 7, 11, 1, 1985);
		Student student4 = new Student(new Person ("Elena","Igorevna","Nesterchuk"), "st.Lenina, 30", "09654444545", "FIFA", 4, 10, 22, 9, 1984);
		Student student5 = new Student(new Person ("Olga","Petrovna","Ivanchello"), "st.Lenina, 11", "09615545545", "MIM", 3, 2, 11, 10, 1985);
		Student student6 = new Student(new Person ("Vera","Grigorievna","Polna"), "st.Lenina, 2", "09654445664", "ME", 5, 2, 20, 3, 1985);
		Student student7 = new Student(new Person ("Olga","Kuzminichna","Ostapchuk"), "st.Lenina, 38", "09615545753", "Economics", 4, 7, 11, 1, 1985);
					
		ArrayList <Student> list  = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		list.add(student6);
		list.add(student7);
		
		Collections.sort(list);
		for(Student s: list) {
			System.out.println(s.toString());
		}
		
		

// вывод всех студентов факультета "Economics"
		
// 
		
		

	}

}
