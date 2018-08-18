package Trains;

import java.time.LocalTime;

public class Train {
private String destination;
private String number;
private LocalTime time;
private Integer countOfSeats;
// конструктор
public Train(String destination, String number, int hours, int minutes, Integer countOfSeats) {
	super();
	this.destination = destination;
	this.number = number;
	time = LocalTime.of(hours, minutes);
	this.countOfSeats = countOfSeats;
}
// геттеры и сеттеры
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public LocalTime getTime() {
	return time;
}
public void setTime(int hours, int minutes) {
	this.time = LocalTime.of(hours, minutes);
}
public Integer getCountOfSeats() {
	return countOfSeats;
}
public void setCountOfSeats(Integer countOfSeats) {
	this.countOfSeats = countOfSeats;
}
// переопределенный метод toString()
@Override
public String toString() {
	return getDestination() + ". " + getNumber() + ". " + getTime()
			+ ". " + getCountOfSeats();
}



}
