package NewYearGift;

abstract class Chocolate extends Sweets {
	Nuts nuts;
	LevelOfChocolate levelOfChocolate;
}

class BrutChocolate extends Chocolate {
	public BrutChocolate(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.levelOfChocolate = levelOfChocolate;
	}
}

class MilkChololate extends Chocolate {
	Boolean bubble;
	public MilkChololate(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate,
			Nuts nuts, Boolean bubble) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.levelOfChocolate = levelOfChocolate;
		super.nuts = nuts;
		this.bubble = bubble;
		
	}
}

class WithoutSugarChocolate extends Chocolate {
	public WithoutSugarChocolate(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate,
			Nuts nuts) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.levelOfChocolate = levelOfChocolate;
		super.nuts = nuts;
	}
}

class DarkChocolate extends Chocolate {
	Boolean bubble;
	
	public DarkChocolate(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate,
			Nuts nuts, Boolean bubble) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.levelOfChocolate = levelOfChocolate;
		super.nuts = nuts;
		this.bubble = bubble;
	}
}

class WhiteChocolate extends Chocolate {
	Boolean bubble;
	public WhiteChocolate(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate,
			Nuts nuts, Boolean bubble) {
		super.levelOfSugar = levelOfSugar;
		super.price = price;
		super.wight = wight;
		super.levelOfChocolate = levelOfChocolate;
		super.nuts = nuts;
		this.bubble = bubble;
	}
}

// молочные шоколады
class Alenka extends MilkChololate {

	public Alenka(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate, Nuts nuts, Boolean bubble) {
		super(levelOfSugar, price, wight, levelOfChocolate, nuts, bubble);
	}
}

class Milka extends MilkChololate {
	public Milka(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate, Nuts nuts, Boolean bubble) {
		super(levelOfSugar, price, wight, levelOfChocolate, nuts, bubble);
	}
}

class Lubimov extends MilkChololate {

	public Lubimov(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate, Nuts nuts, Boolean bubble) {
		super(levelOfSugar, price, wight, levelOfChocolate, nuts, bubble);
	}
}

// горькие шоколады
class BelgianChocolate extends BrutChocolate {

	public BelgianChocolate(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate) {
		super(levelOfSugar, price, wight, levelOfChocolate);
	}
}

class FranchChocolate extends BrutChocolate {

	public FranchChocolate(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate) {
		super(levelOfSugar, price, wight, levelOfChocolate);
	}
}

// темные шоколады
class RoshenDark extends DarkChocolate {

	public RoshenDark(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate, Nuts nuts,
			Boolean bubble) {
		super(levelOfSugar, price, wight, levelOfChocolate, nuts, bubble);
	}
}

class MilleniumDark extends DarkChocolate {

	public MilleniumDark(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate, Nuts nuts,
			Boolean bubble) {
		super(levelOfSugar, price, wight, levelOfChocolate, nuts, bubble);
	}	
}

class KoronaDark extends DarkChocolate {

	public KoronaDark(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate, Nuts nuts,
			Boolean bubble) {
		super(levelOfSugar, price, wight, levelOfChocolate, nuts, bubble);
	}
}

// белые шоколады
class MilleniumWhite extends WhiteChocolate {

	public MilleniumWhite(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate, Nuts nuts,
			Boolean bubble) {
		super(levelOfSugar, price, wight, levelOfChocolate, nuts, bubble);
	}
}

class MilkaWhite extends WhiteChocolate {

	public MilkaWhite(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate, Nuts nuts,
			Boolean bubble) {
		super(levelOfSugar, price, wight, levelOfChocolate, nuts, bubble);
	}
}

class RoshenWhite extends WhiteChocolate {

	public RoshenWhite(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate, Nuts nuts,
			Boolean bubble) {
		super(levelOfSugar, price, wight, levelOfChocolate, nuts, bubble);
	}
}

class Freedom extends WithoutSugarChocolate {

	public Freedom(Double levelOfSugar, Double price, Double wight, LevelOfChocolate levelOfChocolate, Nuts nuts) {
		super(levelOfSugar, price, wight, levelOfChocolate, nuts);
	}
}
