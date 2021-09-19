
public class Patterns {
	public static void main(String[] args) {

		// square 5 X 5
		System.out.println("square 5 X 5");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		System.out.println();

		// Rectangle 5 X 4
		System.out.println("Rectangle 5 X 4");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		System.out.println();

		// Right Angle Triangle
		System.out.println("Right Angle Triangle");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

		System.out.println();

		// Left Angle Triangle
		System.out.println("Left Angle Triangle");
		int row1 = 6;
		// Outer loop work for rows
		for (int i = 0; i < row1; i++) {
			// inner loop work for space
			for (int j = 2 * (row1 - i); j >= 0; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (int j = 0; j <= i; j++) {
				// prints star
				System.out.print("* ");
			}
			System.out.println();
		}
		
			System.out.println();

			// Right Angle Triangle NUmeric
			System.out.println("Right Angle Triangle Numeric");
			for (int i1 = 0; i1 < 5; i1++) {
				for (int j = 0; j <= i1; j++) {
					System.out.print(j + 1 + " ");
				}
				System.out.println();
			}

			System.out.println();

			System.out.println();
			// Mirror Right Angle Triangle
			System.out.println("Mirror Right Angle Triangle");
			for (int i1 = 0; i1 < 5; i1++) {
				for (int j = i1; j < 5; j++) {
					System.out.print("*" + " ");
				}
				System.out.println();
			}

			// Comination
			System.out.println("Combination");
			int rows = 7;
			for (int i1 = 0; i1 <= rows - 1; i1++) {
				for (int j = 0; j <= i1; j++) {
					System.out.print("*" + " ");
				}
				System.out.println("");
			}
			for (int i1 = rows - 1; i1 >= 0; i1--) {
				for (int j = 0; j < i1; j++) {
					System.out.print("*" + " ");
				}
				System.out.println("");
			}

			System.out.println();
			// Pyramid
			System.out.println("Pyramid");
			int row = 6;
			// Outer loop work for rows
			for (int i = 0; i < row; i++) {
				// inner loop work for space
				for (int j = row - i; j > 1; j--) {
					// prints space between two stars
					System.out.print(" ");
				}
				// inner loop for columns
				for (int j = 0; j <= i; j++) {
					// prints star
					System.out.print("* ");
				}
				// throws the cursor in a new line after printing each line
				System.out.println();
			}
		}
	
}
