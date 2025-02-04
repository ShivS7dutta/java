package practise;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int n,count=0;
		System.out.println("Enter any number");
		Scanner  r =new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}	
		}	
		if(count==2)
			System.out.println("Prime number");
		else
			System.out.println("Not Prime number");
	}
	
/*
 System.out.println("print 1 to 100");
        
        for(int num=2;num <=100;num++)
        {
            if(isPrime(num))
            {
                System.out.print(num + " ");
            }
        }
        
    }
    public static boolean isPrime(int n)
    {
        if(n<2) return false;
        for(int i=2;i <=Math.sqrt(n);i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
	
 */

}
