package easy;

import java.util.*;

public class LuckyNumbersInAMatrix {

    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> answer = new ArrayList<Integer>();
        HashSet<Integer> mins = new HashSet<Integer>();
        for(int i = 0; i < matrix.length; i++){
            int rowMin = matrix[i][0]; 
            for(int j = 1; j < matrix[i].length; j++){
                if(matrix[i][j] < rowMin){
                    rowMin = matrix[i][j];
                }
            }
            mins.add(rowMin);  
        }
        for(int i = 0; i < matrix[0].length; i++){
            int columnMax = 0;
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] > columnMax){
                    columnMax = matrix[j][i];
                }
            }
            if(mins.contains(columnMax)){
                answer.add(columnMax);
            }
        }
    return answer;
    }
    
}