package easy;

import java.util.*;
public class SumOfUniqueElements {
	
    public int sumOfUnique(int[] nums) {
        
        Set<Integer> numbers = new HashSet<Integer>();
        Set<Integer> subtract = new HashSet<Integer>();

        int sum = 0;
        for(Integer i : nums){
            if(numbers.add(i)){
                sum += i;
            }else{
                subtract.add(i);
            }

        }
        for(Integer i : subtract){
            sum -= i;
        }


        return sum;

    }
}