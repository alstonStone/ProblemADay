package easy;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int total = 0;
    	for(Integer n: nums) {
    		total += n;
    	}
    	
    	int sum = 0;
    	for(int i=0; i< nums.length; i++) {
            
    		if((total - sum) - nums[i] == sum ){
    			return i;
    		}
    		sum += nums[i];
    		
    	}
    	return -1;
    }
	
}
