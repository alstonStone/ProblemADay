package easy;

import java.util.Arrays;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
public class TwoSum {

	
	public void run() {
		
		int[] inputNumbers = {2,7,11,15};
		int inputTarget = 9;
		System.out.println("expected solution is [0,1] ");
		System.out.println("solution: "+ Arrays.toString(twoSum(inputNumbers,inputTarget)) );
				
	}
	
	
	

	    public int[] twoSum(int[] nums, int target) {
	         
	        for(int i = 0; i < nums.length; i++){
	            for(int s = i+1; s < nums.length; s++){
	                if(nums[i] + nums[s] == target){
	                   int[] solution = {i,s};
	                   return solution;
	                }
	            }
	        }
	        return nums;
	    }

	
	    
	    
	    
	    
	    
	
}
