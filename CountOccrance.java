package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccrance {

	public static void main(String[] args) {

	
		//Scanner scanner = new Scanner(System.in);
		//  System.out.print("Enter a string: ");
		//  String input = scanner.nextLine();
		String input="shivnath3453";

		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char c : input.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		System.out.println("Character occurrences:");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		//scanner.close();
		/*
		String str = "google"; 
		HashMap <Character, Integer> charCount = new HashMap<>();  
		for (int i = str.length() - 1; i >= 0; i--)   
		{  
		if(charCount.containsKey(str.charAt(i)))   
		{  
		int count = charCount.get(str.charAt(i));  
		charCount.put(str.charAt(i), ++count);  
		}   
		else   
		{  
		charCount.put(str.charAt(i),1);  
		}  
		}  
		System.out.println(charCount); */

	}}
