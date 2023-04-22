package easy;

public class KeepMultiplyingFoundValuesByTwo {

    public int findFinalValue(int[] nums, int original) {
        boolean working = true;
        int searchFor = original;        
        boolean found = false;
        while(working){
            for(Integer i : nums){
                if(i == searchFor){
                    searchFor = searchFor * 2;
                    found = true;
                    break;
                }
            }
            if(found){
                found = false;
                continue;
            }else{
                working = false;
            }
        }
        return searchFor;
    }
    
}