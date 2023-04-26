package easy;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {

    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
        for(Character c: chars.toCharArray()){
            if(charCount.containsKey(c)){
                charCount.replace(c, charCount.get(c) + 1);
            }else{
                charCount.put(c,1);
            }
        }  
        for(String s : words){
            HashMap<Character,Integer> workingCopy = new HashMap<Character,Integer>(charCount);
            boolean status = true;
            for(Character c: s.toCharArray()){
                if(workingCopy.containsKey(c)){
                    if(workingCopy.get(c) <= 0){
                        status = false;
                        break;
                    }else{
                        workingCopy.replace(c,workingCopy.get(c) - 1);
                    }
                }else{
                    status = false;
                    break;
                }
            }
            if(status){
                sum = sum + s.length();
            }     
        }
        return sum;
    }
}