import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		int arr[] = {5 ,6, 7, 7, 8, 9, 9, 9};
		
		Set<Integer> set = new HashSet<>();
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i< arr.length;i++) {
			if(set.add(arr[i]) == false) {
				list.add(arr[i]);
			}
		}
			System.out.println(list);
		//list.forEach(i->System.out.println(i));
	}
}
