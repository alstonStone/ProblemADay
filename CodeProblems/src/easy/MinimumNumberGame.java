package easy;

import java.util.ArrayList;
import java.util.Comparator;

public class MinimumNumberGame {

    public int[] numberGame(int[] nums) {
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for(Integer i : nums){
            sorted.add(i);
        }
        sorted.sort(Comparator.naturalOrder());
        int[] arr = new int[nums.length];
        System.out.println(sorted);
        for(int i = 0; i < sorted.size(); i++){
            if( i % 2 ==0){
                arr[i+1] = sorted.get(i);
            }else{
                arr[i-1] = sorted.get(i);
            }
        }
        return arr;
    }
}