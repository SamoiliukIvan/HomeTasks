package NewYearGift;

abstract class Candy extends Sweet {
	private FillingOfSweet fillingOfSweet; // тип начинки

	Candy(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet) {
		super(wight, levelOfSugar, price);
		this.fillingOfSweet = fillingOfSweet;
	}

	FillingOfSweet getFillingOfSweet() {
		return fillingOfSweet;
	}

	void setFillingOfSweet(FillingOfSweet fillingOfSweet) {
		this.fillingOfSweet = fillingOfSweet;
	}
}

abstract class CaramelCandy extends Candy {
	private LevelOfHardness levelOfHardness; // уровень твердости карамели

	CaramelCandy(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet,
			LevelOfHardness levelOfHardness) {
		super(wight, levelOfSugar, price, fillingOfSweet);
		this.levelOfHardness = levelOfHardness;
	}

	LevelOfHardness getLevelOfHardness() {
		return levelOfHardness;
	}

	void setLevelOfHardness(LevelOfHardness levelOfHardness) {
		this.levelOfHardness = levelOfHardness;
	}
}

abstract class ChocolateCandy extends Candy {
	private LevelOfCacao levelOfCacao;

	ChocolateCandy(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet,
			LevelOfCacao levelOfCacao) {
		super(wight, levelOfSugar, price, fillingOfSweet);
		this.setLevelOfCacao(levelOfCacao);
	}

	public LevelOfCacao getLevelOfCacao() {
		return levelOfCacao;
	}

	public void setLevelOfCacao(LevelOfCacao levelOfCacao) {
		this.levelOfCacao = levelOfCacao;
	}
}

abstract class JellyCandy extends Candy {
	private BinderAgent binderAgent; // выбор связующего вещества из перечисления

	JellyCandy(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet,
			BinderAgent binderAgent) {
		super(wight, levelOfSugar, price, fillingOfSweet);
		this.setBinderAgent(binderAgent);
	}

	public BinderAgent getBinderAgent() {
		return binderAgent;
	}

	public void setBinderAgent(BinderAgent binderAgent) {
		this.binderAgent = binderAgent;
	}
}

abstract class WafflesCandy extends Candy {
	private Shape shape; // форма вафель
	private FlavourOfWaffels flavourOfWaffels; // выбор вкуса вафель из перечисления

	WafflesCandy(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet, Shape shape,
			FlavourOfWaffels flavourOfWaffels) {
		super(wight, levelOfSugar, price, fillingOfSweet);
		this.shape = shape;
		this.flavourOfWaffels = flavourOfWaffels;
	}

	Shape getShape() {
		return shape;
	}

	void setShape(Shape shape) {
		this.shape = shape;
	}

	FlavourOfWaffels getFlavourOfWaffels() {
		return flavourOfWaffels;
	}

	void setFlavourOfWaffels(FlavourOfWaffels flavourOfWaffels) {
		this.flavourOfWaffels = flavourOfWaffels;
	}
}

// карамельные конфеты
class StrawberryWithCream extends CaramelCandy {

	StrawberryWithCream(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet,
			LevelOfHardness levelOfHardness) {
		super(wight, levelOfSugar, price, fillingOfSweet, levelOfHardness);
		// TODO Auto-generated constructor stub
	}
}

class LittleCow extends CaramelCandy {

	LittleCow(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet,
			LevelOfHardness levelOfHardness) {
		super(wight, levelOfSugar, price, fillingOfSweet, levelOfHardness);
		// TODO Auto-generated constructor stub
	}
}

// шоколадные конфеты
class Karakum extends ChocolateCandy {

	Karakum(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet, LevelOfCacao levelOfCacao) {
		super(wight, levelOfSugar, price, fillingOfSweet, levelOfCacao);
		// TODO Auto-generated constructor stub
	}
}

class Belochka extends ChocolateCandy {

	Belochka(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet,
			LevelOfCacao levelOfCacao) {
		super(wight, levelOfSugar, price, fillingOfSweet, levelOfCacao);
		// TODO Auto-generated constructor stub
	}
}

class Maska extends ChocolateCandy {

	Maska(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet, LevelOfCacao levelOfCacao) {
		super(wight, levelOfSugar, price, fillingOfSweet, levelOfCacao);
		// TODO Auto-generated constructor stub
	}
}

class Toffy extends ChocolateCandy {

	Toffy(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet, LevelOfCacao levelOfCacao) {
		super(wight, levelOfSugar, price, fillingOfSweet, levelOfCacao);
		// TODO Auto-generated constructor stub
	}

}

// желейные конфеты
class CrazyBee extends JellyCandy {

	CrazyBee(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet, BinderAgent binderAgent) {
		super(wight, levelOfSugar, price, fillingOfSweet, binderAgent);
		// TODO Auto-generated constructor stub
	}
}

class YuzhnayaNoch extends JellyCandy {

	YuzhnayaNoch(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet,
			BinderAgent binderAgent) {
		super(wight, levelOfSugar, price, fillingOfSweet, binderAgent);
		// TODO Auto-generated constructor stub
	}
}

class RealMonsters extends JellyCandy {

	RealMonsters(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet,
			BinderAgent binderAgent) {
		super(wight, levelOfSugar, price, fillingOfSweet, binderAgent);
		// TODO Auto-generated constructor stub
	}
}

// вафельные конфеты
class PineApple extends WafflesCandy {

	PineApple(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet, Shape shape,
			FlavourOfWaffels flavourOfWaffels) {
		super(wight, levelOfSugar, price, fillingOfSweet, shape, flavourOfWaffels);
		// TODO Auto-generated constructor stub
	}
}

class Jack extends WafflesCandy {

	Jack(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet, Shape shape,
			FlavourOfWaffels flavourOfWaffels) {
		super(wight, levelOfSugar, price, fillingOfSweet, shape, flavourOfWaffels);
		// TODO Auto-generated constructor stub
	}
}

class Gulliver extends WafflesCandy {

	Gulliver(Double wight, Double levelOfSugar, Double price, FillingOfSweet fillingOfSweet, Shape shape,
			FlavourOfWaffels flavourOfWaffels) {
		super(wight, levelOfSugar, price, fillingOfSweet, shape, flavourOfWaffels);
		// TODO Auto-generated constructor stub
	}
}
