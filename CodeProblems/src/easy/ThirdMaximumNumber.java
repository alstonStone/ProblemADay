package easy;

import java.util.*;

public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        Deque<Integer> max = new ArrayDeque<Integer>();
        ArrayList<Integer> start = new ArrayList<Integer>();
        for(Integer i: nums){
            start.add(i);
        }
        start.sort(Comparator.reverseOrder());
        for(Integer i : start){
            if(max.contains(i)){
                continue;
            }else{
                max.addFirst(i);
                if(max.size() == 3){
                    return max.getFirst();
                }
            }
        }
        return start.get(0);
    }
    
}