package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		NumberClass Numclass=new NumberClass();
		ArrayList<Integer> list=new ArrayList<>();
		list.addAll(Arrays.asList(2,3,5,4,6,7,7,8));
		
		System.out.println(Numclass.getNthHighestValue(list, 2));
	}

}
