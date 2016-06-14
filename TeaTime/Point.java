public class Point extends Shape {

	public Point(int x, int y, char fill) {
		super(x, y, fill, true);

	}

	public Point() {
		this(1, 1, '*');
	}

	@Override
	public String describe() {
		// System.out.println("Point: " + super.describe());
		return "Point: " + super.describe();

	}

	@Override
	public void draw() {
		putYToMap();

		for (int i = 0; i < this.getX(); i++) {
			System.out.print(getBackground());
		}

		System.out.print(this.getFill());
		for (int i = 0; i < FIELD - this.getX() - 1; i++) {
			System.out.print(getBackground());
		}
		System.out.println("");
	}

	@Override
	public void move(int dx, int dy) {
		if (getX() + dx < FIELD && getX() + dx > 0) {
			this.setX(this.getX() + dx);
			this.setY(this.getY() + dy);
		}
	}

}
