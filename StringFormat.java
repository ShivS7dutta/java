package String;

public class StringFormat {

	public static void main(String[] args) {
		String Input ="mY naMe is shivNath";
		String Output=formatString(Input);
		System.out.println(Output);
		}

		public static String formatString(String Input)
		{
		String[] words=Input.split(" ");
		StringBuilder format= new StringBuilder();

		for(String word:words)
		{
			if(word.length()>0)
			{
				format.append(Character.toUpperCase(word.charAt(0)));
				format.append(word.substring(1).toLowerCase());
			}
		}
		    return format.toString();
		}

	}

