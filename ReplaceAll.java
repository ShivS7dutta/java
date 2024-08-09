package String;

import java.util.Arrays;

public class ReplaceAll {

	public static void main(String[] args) {
		
		String name="Shivnath Dutta";
		
		name=name.toLowerCase();
		System.out.println(name);
		
	//	name=name.replace("", "_");
		String result=name.replaceAll(" ", "");//ShivnathDutta
		System.out.println(result);
		String input = "The quick brown fox jumps over the lazy dog.";
		String[] words = input.split(" ");
		System.out.println(Arrays.toString(words));
		// Output: [The, quick, brown, fox, jumps, over, the, lazy, dog.]*
		
		String c="shivnathdutta     ";
		System.out.println(c.trim());
		

	}

}
