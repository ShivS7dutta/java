package Array;

public class largestANDSmallestNumber {

	public static void main(String[] args) {
		
		    //    int[] array = {3, 5, 7, 2, 8, -1, 4};

		/*        int[] result = findMinMax(array);
		        System.out.println("Smallest number: " + result[0]);
		        System.out.println("Largest number: " + result[1]);
		    }

		    public static int[] findMinMax(int[] array) {
		        int min = array[0];
		        int max = array[0];
		        
		        for (int num : array) {
		            if (num < min) {
		                min = num;
		            }
		            if (num > max) {
		                max = num;
		            }
		        }
		        
		        return new int[]{min, max};*/
		    
		//only find largest then we use this
		        int[] numbers = {3, 5, 7, 2, 8, -1, 4};
		        int largest = numbers[0]; // Assume the first number is the largest

		        for (int i = 1; i < numbers.length; i++) {
		            if (numbers[i] > largest) {
		                largest = numbers[i]; // Update largest if current number is greater
		            }
		        }

		        System.out.println("The largest number in the array is: " + largest);

	}

}
