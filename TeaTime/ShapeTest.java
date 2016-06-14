public class ShapeTest {

	public static void main(String[] args) {
		ShapeTest shapeTest;
		shapeTest = new ShapeTest();
		Rotable[] shapes = {
				// new Triangle(2,3,'*',5,true),
				// new Triangle(4,4,'*',7,true),
				// new Rectangle(9,6,3,3,'*',true),
				// new Rectangle(),
				// new Rectangle(3,1,9,5,'X',true),
				//new Point(3, 1, '*'), new Line(2, 2, '*', 6),
				new Rectangle(3, 1, 9, 5, 'X', false),
				new Triangle(2, 3, '*', 7, false),
//  			new Book(1, 1, 1, 1)
		};

		// for(Shape a: shapes){
		// System.out.println(a.describe());
		// a.draw();
		// shapeTest.printSeparator(Shape.FIELD,'#');
		// }
		for (Rotable a : shapes) {
			// original
			System.out.println(a.describe());
			a.draw();
			shapeTest.printSeparator(Shape.FIELD, '#');

			// rotated 90
			a.rotate();
			System.out.println(a.describe());
			a.draw();
			shapeTest.printSeparator(Shape.FIELD, '#');

			// rotated 180
			a.rotate();
			System.out.println(a.describe());
			a.draw();
			shapeTest.printSeparator(Shape.FIELD, '#');

			// rotated 270
			a.rotate();
			System.out.println(a.describe());
			a.draw();
			shapeTest.printSeparator(Shape.FIELD, '#');

			// rotated 360
			a.rotate();
			System.out.println(a.describe());
			a.draw();
			shapeTest.printSeparator(Shape.FIELD, '#');

			// move 4,4
			a.move(4, 4);
			System.out.println(a.describe());
			a.draw();
			shapeTest.printSeparator(Shape.FIELD, '#');

			// move 80, 80
			a.move(80, 80);
			System.out.println(a.describe());
			a.draw();
			shapeTest.printSeparator(Shape.FIELD, '#');
		}

	}

	private void printSeparator(int number, char fill) {
		for (int i = 0; i < number; i++) {
			System.out.print(fill);
		}
		System.out.println();
	}
}
