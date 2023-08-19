package Pattern;

public class SimplePatternReverse {
	public static void main(String[] args) {
		int numberofLines = 5;
		// First for loop for printing number of lines
		for (int i = 1; i <= numberofLines; i++) {
			// set up a equation between number of lines and stars
			for (int j = (numberofLines - i + 1); j >= 1; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}