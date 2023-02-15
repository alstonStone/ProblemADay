package easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                boolean found = false;
                for(int n = i+1; n < nums.length; n++){ 
                    if(nums[n] != val){
                        nums[i] = nums[n];
                        nums[n] = val;
                        found = true;
                        break;
                    }
                }
                if(found == false){
                    return k;
                }

            }
            k++;
        }
        return k;
    }

}
