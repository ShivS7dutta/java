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
	}

	

}
