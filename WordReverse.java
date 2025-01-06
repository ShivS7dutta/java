package String;

public class WordReverse {

	public static void main(String[] args) {
	        String sentence = "My name is      sjgshj";  // Sentence to reverse the words
	        String[] words = sentence.split("\\s+");  // Split sentence into words
	      
	        // Reverse the words in the array
	        String reversedSentence = "";
	        
	        // Loop through words in reverse order
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedSentence += words[i] + " ";  // Append word and a space
	        }
	        
	        // Remove the trailing space at the end
	        reversedSentence = reversedSentence.trim();
	        
	        System.out.println("Reversed sentence: " + reversedSentence);
	}

}
