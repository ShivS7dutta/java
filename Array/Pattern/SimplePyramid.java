package Pattern;

public class SimplePyramid {

	public static void main(String[] args) {
		int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

	}
/*	    1
	   121
	  12321
	 1234321
	123454321 */
	

}
