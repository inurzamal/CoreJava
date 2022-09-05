package interview;

import java.util.HashSet;
import java.util.Set;

public class Union_And_Intersection {
	
	static void unionElement(int arr1[], int arr2[]) {
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		System.out.println(set);
	}
	
	static void commonElements(int arr1[], int arr2[]) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++ ) {
			if(set.contains(arr2[i])) {
				System.out.print(arr2[i]+" ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr1[] = {3,4,5,50};
		
		int arr2[] = {3,4,5,10,20,30};
		
		unionElement(arr1, arr2);
		
		commonElements(arr1,arr2);

	}
}
