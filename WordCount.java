package String;

public class WordCount {

	public static void main(String[] args) {
		String strCountword = "My Name is shub";
        
        // Remove leading and trailing whitespaces
        strCountword = strCountword.trim();
        
        System.out.println(strCountword);
        // Split the string by whitespace
        String[] words = strCountword.split("\\s+");
        
        // Count the number of words
        int numWords = words.length;
        
        // Print the result
        System.out.println("Number of words: " + numWords);

	}

}
