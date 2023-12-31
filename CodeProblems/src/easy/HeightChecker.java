package easy;

import java.util.Arrays; 
import java.util.ArrayList; 
import java.util.Comparator;

public class HeightChecker {

    public int heightChecker(int[] heights) {
        ArrayList<Integer> sorted =  new ArrayList<Integer>(); 
        for(Integer i: heights){
            sorted.add(i);
        }
        sorted.sort(Comparator.naturalOrder());

        int changes = 0;
        for(int i=0; i < heights.length; i++){
            if(heights[i] != sorted.get(i)){
                changes++;
            }
        }
        return changes;
    }
    
}