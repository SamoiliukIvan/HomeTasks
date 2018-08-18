package MyInterface;

public class RunnerMyList {

	public static void main(String[] args) {
	DefaultMyList l = new DefaultMyList();
	l.add("Корова");
	l.add("Собака");
	l.add(1);
	l.add((Integer)5);
	l.add((Integer)5);
	System.out.println(l.toString());
			
	}
	

}
