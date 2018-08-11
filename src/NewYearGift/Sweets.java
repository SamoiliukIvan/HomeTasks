package NewYearGift;

class Sweets implements Comparable<Sweets>{
	Double wight;
	Double levelOfSugar;
	Double price;
	@Override
	public int compareTo(Sweets o) {
		return this.price.compareTo(o.price);
	}
	
	Double getWight() {
		return wight;
	}
	void setWight(Double wight) {
		this.wight = wight;
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

	@Override
	public String toString() {
		return "Sweets [wight=" + wight + ", levelOfSugar=" + levelOfSugar + ", price=" + price + "]";
	}
	
	
}
