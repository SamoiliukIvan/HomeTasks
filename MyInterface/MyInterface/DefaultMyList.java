package MyInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DefaultMyList implements MyList, Iterator<DefaultMyList>{
	ArrayList<Object> list = new ArrayList<Object>();

	public DefaultMyList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Object e) {
		list.add(e);
		System.out.println("Добавлен новый элемент");
	}

	@Override
	public void clear() {
		list.clear();
		System.out.println("Список очищен");
	}

	@Override
	public boolean remove(Object o) {
		System.out.println("Элемент удален");
		return list.remove(o);
		
	}

	@Override
	public Object[] toArray() {
		System.out.println("Список переведен в массив");
		return list.toArray();
		
	}

	@Override
	public int size() {
		System.out.println("Размер списка " + list.size());
		return list.size();
	}

	@Override
	public boolean contains(Object o) {
		return list.contains(o);
	}

	@Override
	public boolean containsAll(MyList c) {
		return list.containsAll((Collection<?>) c);
	}

	@Override
	public String toString() {
		int num = 0;
		for (Iterator<Object> iter = list.iterator(); iter.hasNext();) {
			Object element = iter.next();
			System.out.println("Элемент №" + num + " это " + element.toString());
			++num;
		}
		return "";
	}

// внутренний класс
	class Inner {
		class MyIterable {

		}
	}

@Override
public boolean hasNext() {
	return false;
}

@Override
public DefaultMyList next() {
	return null;
}
}
