package easy;

import java.util.HashMap; // import the HashMap class
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> valueCount = new HashMap<Integer,Integer>();
        for(Integer i: arr){
            if(valueCount.containsKey(i)){
                valueCount.replace(i, valueCount.get(i)+1);
            }else{
                valueCount.put(i,1);
            }
        }
        Set<Integer> set = new HashSet<Integer>(valueCount.values());
        if(valueCount.values().size() == set.size()){
            return true;
        }
        return false;
    }
}