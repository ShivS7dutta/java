package String;

public class StringFormatt {
    public static void main(String[] args) {
        String input = "mY naME is shivNath";
        String output = formatString(input);
        System.out.println(output);
    }

    public static String formatString(String input) {
        String[] words = input.split(" ");
        String output = "";

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter and lowercase the rest
                output += Character.toUpperCase(word.charAt(0)); // Capitalize first letter
                output += word.substring(1).toLowerCase(); // Lowercase the rest
                output += " "; // Add space between words
            }
        }

        return output.trim(); // Remove the trailing space
    }
}
//output:My Name Is Shivnath
