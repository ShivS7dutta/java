package String;

public class Reversewordothermethod {

	public static void main(String[] args) {
		
		String input = "this is pen";
        
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Rearrange the words
        String rearranged = words[2] + " " + words[1] + " " + words[0];
        
        // Output the result
        System.out.println(rearranged);

	}

}
