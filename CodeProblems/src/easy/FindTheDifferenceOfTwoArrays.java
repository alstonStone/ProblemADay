package easy;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> nums1Set = new HashSet<Integer>();
        Set<Integer> nums2Set = new HashSet<Integer>();
        ArrayList<Integer> notIn1 = new ArrayList<Integer>();
        ArrayList<Integer> notIn2 = new ArrayList<Integer>();
        List<List<Integer>> answer = new ArrayList<>();

        for(Integer i : nums1){
            nums1Set.add(i);
        }

        for(Integer i : nums2){
            if(nums1Set.add(i)){
                notIn1.add(i);
            }
            nums2Set.add(i);
        }
        for(Integer i : nums1){
            if(nums2Set.add(i)){
                notIn2.add(i);
            }
        }
        answer.add(notIn2);
        answer.add(notIn1);
        
        return answer;
    }
}