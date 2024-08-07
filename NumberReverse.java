package String;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
	
		int n,r,rev=0;
		System.out.println("Enter a number");
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			System.out.print(r);
		}
		
		}
		

}
