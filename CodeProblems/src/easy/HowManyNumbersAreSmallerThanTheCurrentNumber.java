package easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        
        int[] answer = new int[nums.length];

        int total = 0;
        for(int i = 0; i < nums.length; i++){

            for(Integer j : nums){
                if( j < nums[i]){
                    total++;
                }
            }
            answer[i] = total;
            total = 0;
        }
        return answer;
    }
}