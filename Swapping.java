package String;

public class Swapping {

	public static void main(String[] args) {
		//without using 3rd variable
		int a = 5;
        int b = 10;
        
        // Print original values
        System.out.println("Before swapping:");
        System.out.println("a: " + a);  // Output: a: 5
        System.out.println("b: " + b);  // Output: b: 10
        
        // Swap using arithmetic operations
        a = a + b;  // a becomes 15 (5 + 10)
        b = a - b;  // b becomes 5 (15 - 10)
        a = a - b;  // a becomes 10 (15 - 5)
        
     // Swap using a temporary variable
        int temp = a;  // Store the value of a in temp
        a = b;         // Assign the value of b to a
        b = temp;      // Assign the value of temp (original a) to b
        
        
        // Print swapped values
        System.out.println("After swapping:");
        System.out.println("a: " + a);  // Output: a: 10
        System.out.println("b: " + b);  // Output: b: 5
      
        
        

	}

}
