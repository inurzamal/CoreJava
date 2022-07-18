import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,2,6,7,10);
		
		Collections.sort(list);
		
		int size = list.size();
		
		Integer second = list.get(size-2);
		
		System.out.println(second);
		
	}
}
