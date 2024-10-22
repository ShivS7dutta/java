package Pattern;

public class InvertedSimpleStar {

	public static void main(String[] args) {
		int rows = 5; // Number of rows

        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k < (2 * (rows - i) - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

	}
/*
 *********
 *******
  *****
   ***
    *
 */
}
