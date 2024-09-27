package String;

import java.util.Arrays;

public class ReplaceAll {

	public static void main(String[] args) {
		
		String name="My Name us    Shivnath        Dutta";
		
		name=name.toLowerCase();
		System.out.println(name);
		
	//	name=name.replace("", "_");
		String result=name.replaceAll("\\s ", " ");//ShivnathDutta
		System.out.println(result);
		
		String input = "The quick brown fox jumps over the lazy dog.";
		String[] words = input.split(" ");
		System.out.println(Arrays.toString(words));
		// Output: [The, quick, brown, fox, jumps, over, the, lazy, dog.]*
		
		String c="shivnathdutta     ";
		System.out.println(c.trim());
		
	/*	public class RemoveSpecialCharacters {
		    public static void main(String[] args) {
		        String input = "Hello, World! Welcome to #Java.";
		        String cleanedString = removeSpecialCharacters(input);
		        System.out.println(cleanedString);  // Output: "Hello World Welcome to Java"
		    }

		    public static String removeSpecialCharacters(String str) {
		        return str.replaceAll("[^a-zA-Z0-9\\s]", "");
		    }
		}
		*/

	}

}
