package Sorting;

public class InsertionSort {
/*
 * Insertion Sort: Insertion sort is another simple sorting algorithm
 *  that builds the final sorted array one item at a time. 
 *  It iterates through the input list, removing one element at a 
 *  time and inserting it into the correct position in 
 *  the sorted portion of the array.
 */
	public static void main(String[] args) {
		 int a[]= {5,2,3,4,6,7,1};
		 int temp,j;
		 for(int i=1;i<a.length;i++)
		 {
			 temp=a[i];
			 j=i;
			 while(j>0 && a[j-1]> temp)
			 {
				 a[j]=a[j-1];
				 j=j-1;
			 }
			 a[j]=temp;
		 } 
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+ " ");
		 }
	}

}
