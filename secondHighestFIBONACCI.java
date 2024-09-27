package practise;
import java.lang.reflect.Array;
import java.util.Arrays;

public class secondHighestFIBONACCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {12,8,10,15,20,25,30};
		int size=array.length;
		Arrays.sort(array);
		System.out.println("second higest number:" +array[size-2]);
		
		//fibonacci
		int n = 10; // Number of Fibonacci terms
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int temp = a;
            a = b;
            b = temp + b;
        }

	}

}
