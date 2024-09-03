package practise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
//		int number = 5;
//        long factorial = factorial(number);
//        System.out.println("Factorial of " + number + " is " + factorial);
//    }
//
//    public static long factorial(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//
//	}
    
    // simple method to enter value and check
    
    
    int n,fact=1;
    System.out.println("Enter number");
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial " + fact);
	}
}
