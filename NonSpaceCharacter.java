package String;

public class NonSpaceCharacter {

	//Calculates the count of non-space characters in the given string
	
	public static void main(String[] args) {
		String a = "My name is Shivnath";
		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
		
		//SimpleStringManipulation
		
		/*
		 * String input = "This is java Program";
        
        // Remove spaces
        String noSpaces = input.replace(" ", "");
        System.out.println("String without spaces: " + noSpaces);
        
        // Reverse the string
        String reversed = reverseString(noSpaces);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input) {
        String reversed = "";
        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Concatenate characters
        }
        
        return reversed;
		 */
	}

	

}
