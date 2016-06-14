public class Rectangle extends Shape implements Rotable {
	private int width, height;

	public Rectangle (int x, int y, int width, int height, char fill,
			boolean fillingUsed) {
		super(x, y, fill, fillingUsed);
		this.height = height;
		this.width = width;

	}

	public Rectangle(int x, int y, int width, char fill, boolean fillingUsed) {
		super(x, y, '*', fillingUsed);
		this.height = width;
		this.width = width;

	}

	public Rectangle() {
		this(2, 2, 5, 5, '*', true);
	}

	@Override
	public String describe() {
		// System.out.println("Rectangle: " + super.describe() + ", width= " +
		// this.getWidth()+ ", height= " + this.getHeight());
		return "Rectangle: " + super.describe() + ", width= " + this.getWidth()
				+ ", height= " + this.getHeight();

	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		char middleFilling = getFill();
		if (isFillingUsed() == false) {
			middleFilling = getBackground();
		}
		if (isRotated()) {
			drawRotated(middleFilling);
		} else {
			drawRectangle(middleFilling);
		}
	}

	private void drawRectangle(char middleFilling) {
		putYToMap();
		int i = 0;
		int j = 0;
		for (i = 0; i < height; i++) {
			for (int k = 0; k < this.getX(); k++) {
				System.out.print(getBackground());
			}
			if (i == 0 || i == height - 1) {
				for (j = 0; j < width; j++) {

					System.out.print(this.getFill());
				}
			} else {
				System.out.print(getFill());
				for (int a = 0; a < width - 2; a++) {
					System.out.print(middleFilling);
				}
				System.out.print(getFill());

			}
			for (j = 0; j < FIELD - this.getX() - this.getWidth(); j++) {
				System.out.print(getBackground());
			}

			System.out.println();
		}
	}

	private void drawRotated(char middleFilling) {
		putYToMap();
		int i = 0;
		int j = 0;
		for (i = 0; i < height; i++) {
			for (int k = 0; k < this.getX(); k++) {
				System.out.print(getBackground());
			}
			if (i == 0 || i == height - 1) {
				for (j = 0; j < width; j++) {

					System.out.print(this.getFill());
				}
			} else {
				System.out.print(getFill());
				for (int a = 0; a < width - 2; a++) {
					System.out.print(middleFilling);
				}
				System.out.print(getFill());

			}
			for (j = 0; j < FIELD - this.getX() - this.getWidth(); j++) {
				System.out.print(getBackground());
			}

			System.out.println();
		}
	}

	@Override
	public void rotate() {
		setRotated(!isRotated());
		int a;
		a = getWidth();
		setWidth(getHeight());
		setHeight(a);
	}

	@Override
	public void move(int dx, int dy) {
		if (getX() + dx < FIELD + width && getX() + dx > 0) {
			this.setX(this.getX() + dx);
			this.setY(this.getY() + dy);
		}
	}

}
