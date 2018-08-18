package Houses;

public class House {
	private static int id;
	private int numberOfApartment;
	private Double square;
	private Floor floor;
	private CountOfRooms countOfRooms;
	private String street;
	private TypeOfBuilding typeOfBuilding;
	private PeriodOfExploitation periodOfExploitation;

// конструктор
	public House(int numberOfApartment, Double square, Floor floor, CountOfRooms countOfRooms, String street,
			TypeOfBuilding typeOfBuilding, PeriodOfExploitation periodOfExploitation) {
		id++;
		this.numberOfApartment = numberOfApartment;
		this.square = square;
		this.floor = floor;
		this.countOfRooms = countOfRooms;
		this.street = street;
		this.typeOfBuilding = typeOfBuilding;
		this.periodOfExploitation = periodOfExploitation;
	}

// геттеры и сеттеры	
	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		House.id = id;
	}

	public int getNumberOfApartment() {
		return numberOfApartment;
	}

	public void setNumberOfApartment(int numberOfApartment) {
		this.numberOfApartment = numberOfApartment;
	}

	public Double getSquare() {
		return square;
	}

	public void setSquare(Double square) {
		this.square = square;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	public CountOfRooms getCountOfRooms() {
		return countOfRooms;
	}

	public void setCountOfRooms(CountOfRooms countOfRooms) {
		this.countOfRooms = countOfRooms;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public TypeOfBuilding getTypeOfBuilding() {
		return typeOfBuilding;
	}

	public void setTypeOfBuilding(TypeOfBuilding typeOfBuilding) {
		this.typeOfBuilding = typeOfBuilding;
	}

	public PeriodOfExploitation getPeriodOfExploitation() {
		return periodOfExploitation;
	}

	public void setPeriodOfExploitation(PeriodOfExploitation periodOfExploitation) {
		this.periodOfExploitation = periodOfExploitation;
	}

	@Override
	public String toString() {
		return getId() + " " + getNumberOfApartment() + ". " + getSquare()
				+ ". " + getFloor() + ". " + getCountOfRooms() + ". "
				+ getStreet() + ". " + getTypeOfBuilding() + ". "
				+ getPeriodOfExploitation();
	}

	
}
