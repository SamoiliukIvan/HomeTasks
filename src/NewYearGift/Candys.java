package NewYearGift;

abstract class Candys extends Sweets {
	FillingOfSweets fillingOfSweets;

	Candys(FillingOfSweets fillingOfSweets) {
		super();
		this.fillingOfSweets = fillingOfSweets;
	}

	FillingOfSweets getFillingOfSweets() {
		return fillingOfSweets;
	}

	void setFillingOfSweets(FillingOfSweets fillingOfSweets) {
		this.fillingOfSweets = fillingOfSweets;
	}

	@Override
	public String toString() {
		return "Candys [fillingOfSweets=" + fillingOfSweets + ", wight=" + wight + ", levelOfSugar=" + levelOfSugar
				+ ", price=" + price + "]";
	}
	
	
}

class CaramelCandies extends Candys {
	LevelOfHardness levelOfHardness;

	CaramelCandies(FillingOfSweets fillingOfSweets, LevelOfHardness levelOfHardness) {
		super(fillingOfSweets);
		this.levelOfHardness = levelOfHardness;
	}

	LevelOfHardness getLevelOfHardness() {
		return levelOfHardness;
	}

	void setLevelOfHardness(LevelOfHardness levelOfHardness) {
		this.levelOfHardness = levelOfHardness;
	}

	@Override
	public String toString() {
		return "CaramelCandies [levelOfHardness=" + levelOfHardness + ", fillingOfSweets=" + fillingOfSweets
				+ ", wight=" + wight + ", levelOfSugar=" + levelOfSugar + ", price=" + price + "]";
	}
	
}

class ChocolateCandies extends Candys {
	LevelOfChocolate levelOfChocolate;

	ChocolateCandies(FillingOfSweets fillingOfSweets, LevelOfChocolate levelOfChocolate) {
		super(fillingOfSweets);
		this.levelOfChocolate = levelOfChocolate;
	}
	
}

class JellyCandies extends Candys {
	BinderAgent binderAgent;
}

class WafflesCandies extends Candys {
	WafflesCandies(FillingOfSweets fillingOfSweets) {
		super(fillingOfSweets);
		// TODO Auto-generated constructor stub
	}
	Shape shape;
	TypeOfWaffels typeOfWaffels;
}

// карамельные конфеты
class StrawberryWithCream extends CaramelCandies {
	public StrawberryWithCream(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			LevelOfHardness levelOfHardness) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.levelOfHardness = levelOfHardness;
	}
}

class LittleCow extends CaramelCandies {
	public LittleCow(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			LevelOfHardness levelOfHardness) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.levelOfHardness = levelOfHardness;
	}
}

// шоколадные конфеты
class Karakum extends ChocolateCandies {
	public Karakum(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			LevelOfChocolate levelOfChocolate) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.levelOfChocolate = levelOfChocolate;
	}
}

class Squirrel extends ChocolateCandies {
	public Squirrel(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			LevelOfChocolate levelOfChocolate) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.levelOfChocolate = levelOfChocolate;
	}
}

class Mask extends ChocolateCandies {
	public Mask(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			LevelOfChocolate levelOfChocolate) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.levelOfChocolate = levelOfChocolate;
	}
}

class Toffy extends ChocolateCandies {
	public Toffy(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			LevelOfChocolate levelOfChocolate) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.levelOfChocolate = levelOfChocolate;
	}
}

// желейные конфеты
class CrazyBee extends JellyCandies {
	public CrazyBee(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			BinderAgent binderAgent) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.binderAgent = binderAgent;
	}
}

class SouthernNight extends JellyCandies {
	public SouthernNight(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			BinderAgent binderAgent) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.binderAgent = binderAgent;
	}
}

class RealMonsters extends JellyCandies {
	public RealMonsters(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			BinderAgent binderAgent) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.binderAgent = binderAgent;
	}
}

// вафельные конфеты
class PineApple extends WafflesCandies {
	public PineApple(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			BinderAgent binderAgent, Shape shape, TypeOfWaffels typeOfWaffels) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.shape = shape;
		super.typeOfWaffels = typeOfWaffels;
	}
}

class Jack extends WafflesCandies {
	public Jack(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			BinderAgent binderAgent, Shape shape, TypeOfWaffels typeOfWaffels) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.shape = shape;
		super.typeOfWaffels = typeOfWaffels;
	}
}

class Gulliver extends WafflesCandies {
	public Gulliver(Double levelOfSugar, Double price, Double wight, FillingOfSweets fillingOfSweets,
			BinderAgent binderAgent, Shape shape, TypeOfWaffels typeOfWaffels) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.fillingOfSweets = fillingOfSweets;
		super.shape = shape;
		super.typeOfWaffels = typeOfWaffels;
	}
}