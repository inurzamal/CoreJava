package interview;


//Modify this code or see from another website and paste in notes also

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostFrequentNumber {
	
	static int mostFrequent(int arr[], int n)
    {
         
       
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        // Insert all elements in hash        
        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            
            if(hm.containsKey(key))
            {
                hm.put(key, hm.get(key)+1);
            }
            else
            {
                hm.put(key, 1);
            }
        }
         
        // find max frequency.
        int max_count = 0, res = -1;
         
        for(Entry<Integer, Integer> val : hm.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
         
        return res;
    }
     
    // Driver code
    public static void main (String[] args) {
         
        int arr[] = {40,50,30,40,50,30,30,5,5,5,5,5};
        int n = arr.length;
         
        System.out.println(mostFrequent(arr, n));
    }

}
