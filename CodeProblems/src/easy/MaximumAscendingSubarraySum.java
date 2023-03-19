package easy;

public class MaximumAscendingSubarraySum {

    public int maxAscendingSum(int[] nums) {

        int max=0;
        int currentTotal=0;
        int lastNumber = 0;

        for(Integer i: nums){

            if(i > lastNumber){
                currentTotal = currentTotal + i;

                if(currentTotal > max){
                    max = currentTotal;
                }
            }else{
                currentTotal = i;
            }
            lastNumber = i;
        }

        return max;
    }
}