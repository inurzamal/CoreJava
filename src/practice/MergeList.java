package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeList {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		
		List<Integer> list3 = new ArrayList<>();
		
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println(list3);
		

	}

}
