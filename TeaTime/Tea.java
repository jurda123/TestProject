package TeaTime;

public class Tea implements Beverage{

	enum Flavour {
		GREEN, BLACK, STRAWBERRY, LEMON, MINT, GINGER, WHITE

	}

	private Flavour flavour;

	public Tea(Flavour flavour) {
		this.flavour = flavour;

	}

	public Tea() {
		this(Flavour.GREEN);

	}

	public Flavour getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}

	public void drink() {
		System.out.println("this " + toString(this.getFlavour())
				+ " tea is delicious");
	}

	public String toString(Flavour flavour) {
		switch (flavour) {
		case GREEN:
			return "green flavour";
		case BLACK:
			return "black flavour";
		case STRAWBERRY:
			return "strawberry flavour";
		case LEMON:
			return "lemon flavour";
		case MINT:
			return "mint flavour";
		case GINGER:
			return "ginger flavour";
		case WHITE:
			return "white flavour";
		default:
			return "invalid flavour";

		}

		// return "this " + this.getFlavour() + " tea is delicious";
	}

}
