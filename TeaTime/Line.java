public class Line extends Shape implements Rotable {
	private int length;

	// private char fill;

	public Line(int x, int y, char fill, int length) {
		super(x, y, fill, true);
		this.length = length;

	}

	public Line() {
		this(1, 1, '*', 10);
	}

	@Override
	public String describe() {
		// System.out.println("Line: " + super.describe()+ ", length = " +
		// this.getLength());
		return "Line: " + super.describe() + ", length = " + this.getLength();

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void draw() {
		if (isRotated()) {
			drawRotated();
		} else {

			drawLine();
		}
	}

	private void drawLine() {
		putYToMap();
		for (int i = 0; i < this.getX(); i++) {
			System.out.print(getBackground());
		}

		for (int i = 0; i < length; i++) {

			System.out.print(this.getFill());
		}
		for (int i = 0; i < FIELD - this.getLength() - this.getX(); i++) {
			System.out.print(getBackground());
		}

		System.out.println();
	}

	public void drawRotated() {
		putYToMap();

		for (int i = 0; i < length; i++) {
			for (int k = 0; k < this.getX(); k++) {
				System.out.print(getBackground());
			}
			System.out.print(this.getFill());

			for (int j = 0; j < FIELD - 1 - this.getX(); j++) {
				System.out.print(getBackground());
			}
			System.out.println();
		}

	}

	@Override
	public void rotate() {
		setRotated(!isRotated());
	}

	@Override
	public void move(int dx, int dy) {
		if (getX() + dx + length < FIELD && getX() + dx > 0) {
			this.setX(this.getX() + dx);
			this.setY(this.getY() + dy);
		}
	}
}
