package collection;

import java.util.Random;

public class RandomString {

	public static String generateRandomString(int length) {
        // Define the characters that can be used in the string (letters and digits)
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        //The Random class is used to generate random indices that are used to select characters from the set.
        
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            stringBuilder.append(characters.charAt(index));
            //We use StringBuilder to efficiently append characters to the final string
        }

        return stringBuilder.toString();
    }
	public static void main(String[] args) {
		int length = 10;  // Specify the length of the random string
        String randomString = generateRandomString(length);
        System.out.println("Generated Random String: " + randomString);
    

	}

}
