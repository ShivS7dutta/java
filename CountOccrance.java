package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccrance {

	public static void main(String[] args) {

		//Scanner scanner = new Scanner(System.in);
		//  System.out.print("Enter a string: ");
		//  String input = scanner.nextLine();
	
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
		
/*
String str="Deepak";
char ch[]=str.toCharArray();
int count=0;
for(int i=0;i<ch.length;i++)
{
 for(int j=0;j<ch.length;j++)
 {
	  if(ch[i]==ch[j] && j<i)
	  {
	    break;
	   }
	  if(ch[i]==ch[j])
	  {
           count++;
      }
}
if(count>0)
{
	System.out.println(ch[i]+" "+count);
}
}
 */
/*
String str = "DevLabs Alliance is awesome.";
char ch = 'e';
int frequency = 0;

for(int i = 0; i < str.length(); i++) {
  if(ch == str.charAt(i)) {
     ++frequency;
     }
  }
System.out.println("Frequency of " + ch + " = " + frequency); 		
*/

	}}
