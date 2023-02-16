package easy;

public class SearchInsertPosition {
	
    public int searchInsert(int[] nums, int target) {
        
        int current;
        int next;
        
        for(int i = 0; i< nums.length; i++){
            current = nums[i];

            if(current == target){
                return i;
            }
            if(target < current){
                return i;
            }

            if(i + 1 < nums.length){
                next = nums[i+1];

                if(target > current && target < next){
                    return i+1;
                }
            }else{
                return i+1;
            }


        }

        return 0;

	}
}
