package easy;

public class RemoveDuplicatesFromSortedArray {

	
public int removeDuplicates(int[] nums) {
        
        int currentSmallest = nums[0];
        int k = 1;
        boolean finished = false;

        while(finished == false){

            boolean foundOne = false;
            for(int i = k; i < nums.length; i++){

                if(nums[i] > currentSmallest){
                    nums[k] = nums[i];
                    currentSmallest = nums[k];
                    foundOne = true;
                    k++;
                    break;
                }
            }

            if(foundOne == false){
                finished = true;
            }
 
        }



       
       return k;

    }

	
}
