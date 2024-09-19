package practise;
import java.lang.reflect.Array;
import java.util.Arrays;

public class secondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {12,8,10,15,20,25,30};
		int size=array.length;
		Arrays.sort(array);
		System.out.println("second higest number:" +array[size-2]);
		

	}

}
