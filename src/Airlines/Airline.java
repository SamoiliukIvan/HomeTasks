package Airlines;

import java.time.LocalTime;

/*Airline: Пункт назначения, Номер рейса, Тип самолета, Время вылета, Дни
недели.
Создать массив объектов. Вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых
больше заданного.*/
public class Airline {
	private String destination;
	private Integer number;
	private TypeOfPlane typeOfPlane;
	private LocalTime time;
	private DayOfWeek daysOfWeek;
// конструктор
	public Airline(String destination, Integer number, TypeOfPlane typeOfPlane, int hour, int minute, DayOfWeek daysOfWeek) {
		this.destination = destination;
		this.number = number;
		this.typeOfPlane = typeOfPlane;
		this.time = LocalTime.of(hour, minute);
		this.daysOfWeek = daysOfWeek;
	}
// геттеры и сеттеры
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public TypeOfPlane getTypeOfPlane() {
		return typeOfPlane;
	}
	public void setTypeOfPlane(TypeOfPlane typeOfPlane) {
		this.typeOfPlane = typeOfPlane;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(int hour, int minute) {
		this.time = LocalTime.of(hour, minute);
	}
	public DayOfWeek getDaysOfWeek() {
		return daysOfWeek;
	}
	public void setDaysOfWeek(DayOfWeek daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}
// переопределенный метод toString()
	@Override
	public String toString() {
		return getDestination() + ". " + getNumber() + ". "
				+ getTypeOfPlane() + ". " + getTime() + ". " + getDaysOfWeek();
	}
	
}
