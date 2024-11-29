package String;

public class StringReverseUsingLoop {

    public static void main(String[] args) {
        
        String str = "Hello India";
        String result = "";
        
        // Loop to reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            char c1 = str.charAt(i);
            result = result + c1;
        }
        
        // Print the reversed string
        System.out.println(result);
        
        // Check if the string is a palindrome
        boolean b1 = str.equals(result);
        if (b1) 
        {
            System.out.println("Palindrome");
        } 
        else 
        {
            System.out.println("Not palindrome");
        }
    }
}
