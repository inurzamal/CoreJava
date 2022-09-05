package interview;


import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumber {
	
	static int mostFrequent(int arr[])
    {     
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(Integer i: arr) {
        	if(hm.containsKey(i)) {
        		hm.put(i, hm.get(i)+1);
        	}else {
        		hm.put(i, 1);
        	}
        }

         
        // find max frequency.
        int max_count = 0, result = -1;
         
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            if (entry.getValue() > max_count)
            {
                max_count = entry.getValue();
                result = entry.getKey();
            }
        }
         
        return result;
    }
     
    // Driver code
    public static void main (String[] args) {
         
        int arr[] = {40,50,30,40,50,30,30,5,5,5,5,5};
        
        int r = mostFrequent(arr);
        
        System.out.println(r);
    }

}
