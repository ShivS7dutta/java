package String;

public class UpperCaseandLowerCase {

	public static void main(String[] args) {
		
		String s="My Name is Shivnath";
		int lower=0;
		int upper=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper++;
			}
			else
			{
				lower++;
			}	
		}
		System.out.println("Upper Character:" +upper);
		System.out.println("Lower Character:" +lower);

	}

}
