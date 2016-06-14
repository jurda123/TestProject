public abstract class Shape {
	private int x, y;
	private char fill;
	private boolean fillingUsed;
	private boolean rotated = false;
	static final int FIELD = 60;

	public boolean isRotated() {
		return rotated;
	}

	public void setRotated(boolean rotated) {
		this.rotated = rotated;
	}

	private char background = '-';

	public Shape(int x, int y, char fill, boolean fillingUsed) {
		this.x = x;
		this.y = y;
		this.setFill(fill);
		this.fillingUsed = fillingUsed;
	}

	public void draw() {
		System.out.print(fill);
	}

	public String describe() {

		return "[" + x + "," + y + "]";

	}

	public char getFill() {
		return fill;
	}

	public boolean isFillingUsed() {
		return fillingUsed;
	}

	public void setFillingUsed(boolean fillingUsed) {
		this.fillingUsed = fillingUsed;
	}

	public void setFill(char fill) {
		this.fill = fill;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void putYToMap() {
		int i;
		for (i = 0; i < getY(); i++) {
			for (int j = 0; j < FIELD; j++) {
				System.out.print(background);
			}
			System.out.println();
		}
	}

	public char getBackground() {
		return background;
	}

	public void setBackground(char background) {
		this.background = background;
	}

	public void move(int dx, int dy) {

		this.setX(this.getX() + dx);
		this.setY(this.getY() + dy);

	}

	public void rotate() {

	}

}
