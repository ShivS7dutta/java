package String;

public class NumerOccurance {

public static void main(String[] args) {
 int number = 1257467;
 String numStr = Integer.toString(number);

// Variable to store the count of digit '7'
 int count = 0;
// StringBuilder to store the positions (indices) where '7' appears
StringBuilder positions = new StringBuilder();
for (int i = 0; i < numStr.length(); i++) {
 char digit = numStr.charAt(i);
   if (digit == '7') {
       count++;
       positions.append(i).append(" ");  // Store the index where '7' occurs
      }
 }
   System.out.println("Digit '7' occurs " + count + " time(s).");
   if (count > 0) {
       System.out.println("Positions of '7': " + positions.toString());
   } else {
      System.out.println("No '7' found in the number.");
  }
}
}
/*
public class AllDigitOccurrence {
  public static void main(String[] args) {
        long number = 1214325645; // Input number
        countDigitOccurrences(number);
    }

    public static void countDigitOccurrences(long number) {
        // Convert the number to a string
        String numberStr = String.valueOf(number);

        // Loop through each digit in the number string
        for (char digit = '0'; digit <= '9'; digit++) {
            int count = 0;
            // Count occurrences of each digit in the string
            for (int i = 0; i < numberStr.length(); i++) {
                if (numberStr.charAt(i) == digit) {
                    count++;
                }
            }
   // If the digit appears in the number, print the result
   if (count > 0) {
    System.out.println("Digit " + digit + " occurs " + count + " times.");
    }
  }
    }
}*/
