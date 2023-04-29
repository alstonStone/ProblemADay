package easy;

import java.util.HashMap;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {       
        int numCandy = candyType.length / 2;
        HashMap<Integer,Integer> candyCount = new HashMap<Integer,Integer>();
        for(Integer i : candyType){
            if(candyCount.containsKey(i)){
                candyCount.replace(i, candyCount.get(i) + 1);

            }else{
                candyCount.put(i,1);
            }
        }
        if(candyCount.size() >= numCandy){
            return numCandy;
        }
        return candyCount.size();
    }
    
}