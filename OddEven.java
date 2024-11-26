package practise;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter any Number");
		Scanner r =new Scanner(System.in);
		n=r.nextInt();
		//int number=3453;
		
		if(n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd Number");
		}	
		
		/*
       int a[] = {2, 3, 1, 5, 6, 7, 8, 4, 12, 14, 25};  
        
        int evenCount = 0;  // To count even numbers
        int oddCount = 0;   // To count odd numbers
        
        // Loop through the array
        for (int num : a) {
            if (num % 2 == 0) {
                evenCount++;  
            } else {
                oddCount++;  
            }
        }
        
        // Output the results
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
       */
	}

}
