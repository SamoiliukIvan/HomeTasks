package NewYearGift;

abstract class Sweet {
	private Double wight; // вес
	private Double levelOfSugar; // уровень сахара
	private Double price; // цена
	
	Sweet(Double weight, Double levelOfSugar, Double price) {
		super();
		this.wight = weight;
		this.levelOfSugar = levelOfSugar;
		this.price = price;
	}
	Double getweight() {
		return wight;
	}
	void setweight(Double weight) {
		this.wight = weight;
	}
	Double getLevelOfSugar() {
		return levelOfSugar;
	}
	void setLevelOfSugar(Double levelOfSugar) {
		this.levelOfSugar = levelOfSugar;
	}
	Double getPrice() {
		return price;
	}
	void setPrice(Double price) {
		this.price = price;
	}
	

//	@Override
//	public int compareTo(Sweet o) {
//		return this.price.compareTo(o.price);
//	}
}
