public class Triangle extends Shape implements Rotable {
	private int size;
	private int rotation;

	public Triangle(int x, int y, char fill, int size, boolean fillingUsed) {
		super(x, y, fill, fillingUsed);
		this.size = size;

	}

	public Triangle() {
		this(1, 1, '*', 5, true);
	}

	@Override
	public String describe() {
		// System.out.println("Triangle: " + super.describe() + ", size: " +
		// this.getSize());
		return "Triangle: " + super.describe() + ", size: " + this.getSize()
				+ ", rotation: " + rotation;

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void draw() {
		putYToMap();

		char middleFilling = getFill();
		if (isFillingUsed() == false) {
			middleFilling = getBackground();
		}
		switch (rotation) {
		case 0:
			drawTriangle(middleFilling);
			break;
		case 90:
			drawTriangle90(middleFilling);
			break;
		case 180:
			drawTriangle180(middleFilling);
			break;
		case 270:
			drawTriangle270(middleFilling);
			break;
		default:
			System.out.print("bad angle");

		}
	}

	private int drawTriangle(char middleFilling) {
		int i;
		for (i = 0; i < size; i++) {
			if (i == 0) {
				printChars(this.getX(), getBackground());
				printChars(1, this.getFill());
				printChars(FIELD - i - 1 - this.getX(), getBackground());
				System.out.println();
			} else if (i == size - 1) {
				printChars(this.getX(), getBackground());
				printChars((i + 1), this.getFill());
				printChars(FIELD - i - 1 - this.getX(), getBackground());
				System.out.println();

			} else {
				printChars(this.getX(), getBackground());
				printChars(1, this.getFill());
				printChars((i - 1), middleFilling);
				printChars(1, this.getFill());
				printChars(FIELD - i - 1 - this.getX(), getBackground());
				System.out.println();
			}
		}
		return i;
	}

	private void drawTriangle90(char middleFilling) {
		int i;
		int size2 = size;
		for (i = 0; i < size; i++) {
			if (i == 0) {

				printChars(this.getX(), getBackground());
				printChars(size, this.getFill());
				printChars(FIELD - i - size - this.getX(), getBackground());
				System.out.println();
			} else if (i == size - 1) {
				printChars(this.getX(), getBackground());
				printChars(1, this.getFill());
				printChars(FIELD - 1 - this.getX(), getBackground());
				System.out.println();

			} else {

				printChars(this.getX(), getBackground());
				printChars(1, this.getFill());
				printChars((size2 - 3), middleFilling);
				printChars(1, this.getFill());
				printChars(FIELD - size2 + 1 - this.getX(), getBackground());
				System.out.println();
				size2--;
			}
		}

	}

	private void drawTriangle180(char middleFilling) {
		int i;
		int size2 = size;
		for (i = 0; i < size; i++) {
			if (i == 0) {

				printChars(this.getX(), getBackground());
				printChars(size, this.getFill());
				printChars(FIELD - size - i - this.getX(), getBackground());
				System.out.println();
			} else if (i == size - 1) {
				printChars(i, getBackground());
				printChars(this.getX(), getBackground());
				printChars(1, this.getFill());
				printChars(FIELD - size - this.getX(), getBackground());
				System.out.println();

			} else {
				printChars(i, getBackground());
				printChars(this.getX(), getBackground());
				printChars(1, this.getFill());
				printChars((size2 - 3), middleFilling);
				printChars(1, this.getFill());
				printChars(FIELD - size - this.getX(), getBackground());

				System.out.println();
				size2--;
			}
		}

	}

	private void drawTriangle270(char middleFilling) {
		int i;
		for (i = 0; i < size; i++) {
			if (i == 0) {
				printChars(size - 1, getBackground());
				printChars(this.getX(), getBackground());
				printChars(1, this.getFill());
				printChars(FIELD - i - size - this.getX(), getBackground());
				System.out.println();
			} else if (i == size - 1) {
				printChars(this.getX(), getBackground());
				printChars((i + 1), this.getFill());
				printChars(FIELD - i - 1 - this.getX(), getBackground());
				System.out.println();

			} else {

				printChars(this.getX(), getBackground());
				printChars(size - i - 1, getBackground());
				printChars(1, this.getFill());
				printChars((i - 1), middleFilling);
				printChars(1, this.getFill());
				printChars(FIELD - size - this.getX(), getBackground());
				System.out.println();
			}
		}

	}

	private static final void printChars(int length, char znak) {
		for (int i = 0; i < length; i++) {
			System.out.print(znak);
		}
	}

	
	
	@Override
	public void rotate() {
		if (rotation == 270) {
			rotation = 0;
		} else {
			rotation = rotation + 90;
		}
	}

	@Override
	public void move(int dx, int dy) {
		if (getX() + dx + size < FIELD && getX() + dx > 0) {
			this.setX(this.getX() + dx);
			this.setY(this.getY() + dy);
		}
	}

}
