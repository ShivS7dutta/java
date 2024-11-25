package String;

public class Checkvowel {

	public static void main(String[] args) {
		
		String input = "welcome to india"; // Given string
        boolean isVowelPresent = false; // Flag to track if a vowel is found
        
        // Convert the string to lowercase for case-insensitive comparison
        input = input.toLowerCase();
        
        // Loop through the string and check each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                isVowelPresent = true;
                break; // No need to check further once a vowel is found
            }
        }
        
        // Output the result
        if (isVowelPresent) {
            System.out.println("Vowel is present in the string.");
        } else {
            System.out.println("No vowels are present in the string.");
        }
	}

}
