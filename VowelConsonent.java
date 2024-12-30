package String;

public class VowelConsonent {

	public static void main(String[] args) {
		String input = "welcome to Noida";  // Input string
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // Get the character at index i

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if the character is a consonant (only alphabetic characters)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }

        // Print the results
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
	}

}
