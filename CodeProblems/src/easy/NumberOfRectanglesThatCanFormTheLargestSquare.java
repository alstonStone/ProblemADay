package easy;

import java.util.ArrayList; // import the ArrayList class
class NumberOfRectanglesThatCanFormTheLargestSquare{
    public int countGoodRectangles(int[][] rectangles) {
        ArrayList<Integer> values = new ArrayList<Integer>();

        for(int[] pair: rectangles){
            int min = Integer.MAX_VALUE;
            for(int i: pair){
                if(i< min){
                    min = i;
                }
            }
            values.add(min);
        }
        int max =0;
        int maxCount =1;
        for(Integer i : values){
            if(i == max){
                maxCount++;
            }
            if(i > max){
                max = i;
                maxCount = 1;
            }
        }
        return maxCount;
    }
}
