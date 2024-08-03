package practise;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
//		int number = 399, originalNumber, remainder, result = 0;
//
//        originalNumber = number;
//
//        while (originalNumber != 0)
//        {
//            remainder = originalNumber % 10;
//            result += Math.pow(remainder, 3);
//            originalNumber /= 10;
//        }
//
//        if(result == number)
//            System.out.println(number + " is an Armstrong number.");
//        else
//            System.out.println(number + " is not an Armstrong number.");
//    
		
	//	simple method
		int no;
		int check,rem,sum =0;
		System.out.println("Enter number");
		Scanner sc= new Scanner(System.in);
		no=sc.nextInt();
		check=no;
		while(check!=0)
		{
			rem=check%10;
			sum=sum+(rem*rem*rem);
			check=check/10;
		}	
		if(sum==no)
		{
			System.out.println("Armstrong");
		}	
		else
		{
			System.out.println("Not Armstrong");
		}
		
	}

}
