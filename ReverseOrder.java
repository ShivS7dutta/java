package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.println("Enter number");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Reverse order");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		// simple sort in descending order
		

		
		        Integer[] array = {5, 3, 8, 1, 2}; // Note: Use Integer[] instead of int[] for Collections.reverseOrder()

		        // Sort in descending order
		        Arrays.sort(array, Collections.reverseOrder());
		        
		        System.out.println("Array in descending order: " + Arrays.toString(array));
		   


	}

}
