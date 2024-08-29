package practise;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + isAnagram);
    }

    public static boolean areAnagrams(String str1, String str2) {
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        return Arrays.equals(array1, array2);


	}

}
