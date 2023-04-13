package easy;

import java.util.*;

public class StringMatchingInAnArray {

    public List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<String>();
        for(int i =0; i < words.length; i++){
            String current = words[i];
            for(int j = 0; j < words.length; j++){
                if(j == i){
                    continue;
                }
                String compTo = words[j];
                if(compTo.length() < current.length()){
                    continue;
                }
                if(compTo.contains(current)){
                    if(answer.contains(current)){
                        break;
                    }else{
                        answer.add(current);
                        break;
                    }
                }
            }
        }
        return answer;    
    }
    
    
}