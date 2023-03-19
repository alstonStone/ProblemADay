package easy;

public class ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        
        int oddCount = 0;
        for(Integer i : arr){
            if( i % 2 != 0){
                oddCount++;
                if(oddCount >= 3){
                    return true;
                }
            }else{
                oddCount = 0;
            }
        }
        return false;
    }
}