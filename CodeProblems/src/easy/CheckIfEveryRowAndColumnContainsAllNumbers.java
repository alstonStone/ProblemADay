package easy;

import java.util.*;

public class CheckIfEveryRowAndColumnContainsAllNumbers {
    public boolean checkValid(int[][] matrix) {
        
    	//check rows
        for(int[] arr: matrix){
            Set<Integer> numbers = new HashSet<Integer>();
            for(Integer i : arr){
                numbers.add(i);
            }
            if(numbers.size() < arr.length){
                return false;
            }
        }

        //check columns
        for(int i = 0; i < matrix.length; i++){
            Set<Integer> numbers = new HashSet<Integer>();
            for(int j = 0; j < matrix.length; j++){
                numbers.add(matrix[j][i]);
            }
            if(numbers.size() < matrix.length){
                return false;
            }
        }



        return true;
    }
}