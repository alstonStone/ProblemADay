package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        
        List<Integer> lastRow = new ArrayList<Integer>();
        for(int i = 1; i <= numRows; i ++){
            List<Integer> currentRow = new ArrayList<Integer>();
            if(i == 1){
                currentRow.add(1);
                
                
            }else if( i == 2){
                currentRow.add(1);
                currentRow.add(1);
                
                
            }else{
                currentRow.add(0,1);
                for(int c = 1; c < i-1; c++){
                    currentRow.add(c,(lastRow.get(c-1) + lastRow.get(c)));
                }
                currentRow.add(i-1,1);
                
            }
            lastRow = currentRow;
            finalList.add(lastRow);



        }
        return finalList;
    }
}
