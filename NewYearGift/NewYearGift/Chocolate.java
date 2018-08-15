package NewYearGift;

abstract class Chocolate extends Sweet {
	Nuts nuts; // выбор орехов из инама
	LevelOfCacao levelOfCacao;
	Boolean bubble; // пористый или нет

	Chocolate(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price);
		this.nuts = nuts;
		this.levelOfCacao = levelOfCacao;
		this.bubble = bubble;
	}

	Nuts getNuts() {
		return nuts;
	}

	void setNuts(Nuts nuts) {
		this.nuts = nuts;
	}

	LevelOfCacao getLevelOfCacao() {
		return levelOfCacao;
	}

	void setLevelOfCacao(LevelOfCacao LevelOfCacao) {
		this.levelOfCacao = LevelOfCacao;
	}
}

abstract class BrutChocolate extends Chocolate {

	BrutChocolate(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
}

class MilkChololate extends Chocolate {

	MilkChololate(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
}

class WithoutSugarChocolate extends Chocolate {

	WithoutSugarChocolate(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
}

class DarkChocolate extends Chocolate {

	DarkChocolate(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
}

class WhiteChocolate extends Chocolate {

	WhiteChocolate(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
}

class Alenka extends MilkChololate {
	public Alenka(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao, Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		this.bubble = bubble;
	}

	@Override
	public String toString() {
		return "Аленка. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

class Alenka2 extends MilkChololate {
	private Alenka2(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao, Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		this.bubble = bubble;
	}

	@Override
	public String toString() {
		return "Аленка2. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

class Milka extends MilkChololate {

	Milka(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao, Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Милка. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

class Lubimov extends MilkChololate {

	Lubimov(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao, Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Любимов. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

// горькие шоколады
class BelgianChocolate extends BrutChocolate {

	BelgianChocolate(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Бельгийский шоколад. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

class FranchChocolate extends BrutChocolate {

	FranchChocolate(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Французский шоколад. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

// темные шоколады
class RoshenDark extends DarkChocolate {

	RoshenDark(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Рошен темный. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

class MilleniumDark extends DarkChocolate {

	MilleniumDark(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Миллениум темный. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

class KoronaDark extends DarkChocolate {

	KoronaDark(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Корона черный. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

// белые шоколады
class MilleniumWhite extends WhiteChocolate {

	MilleniumWhite(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Миллениум белый. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

class MilkaWhite extends WhiteChocolate {

	MilkaWhite(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Милка белый. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

class RoshenWhite extends WhiteChocolate {

	RoshenWhite(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao,
			Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Рошен белый. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}

class Freedom extends WithoutSugarChocolate {

	Freedom(Double wight, Double levelOfSugar, Double price, Nuts nuts, LevelOfCacao levelOfCacao, Boolean bubble) {
		super(wight, levelOfSugar, price, nuts, levelOfCacao, bubble);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Фридом. Орехи - " + getNuts() + ", Уровень какао -" + getLevelOfCacao() + ", Вес - "
				+ getweight() + ", Уровень сахара - " + getLevelOfSugar() + ", Цена - " + getPrice();
	}
}
