package easy;
import java.util.*;
public class RearrangeCharactersToMakeTargetString {

    public int rearrangeCharacters(String s, String target) {

        //contains the number of each letter required to make a word
        HashMap<Character,Integer> targetLetters = new HashMap<Character,Integer>();
        for(Character c: target.toCharArray()){
            if(targetLetters.containsKey(c)){
                targetLetters.replace(c,targetLetters.get(c)+1);
            }else{
                targetLetters.put(c,1);
            }
        }

        //holds a count for each letter that apears in the string that also appears in target
        HashMap<Character,Integer> stringLetters = new HashMap<Character,Integer>();
        for(Character c: s.toCharArray()){
        
            if(targetLetters.containsKey(c)){
                if(stringLetters.containsKey(c)){
                    stringLetters.replace(c,stringLetters.get(c)+1);
                }else{
                    stringLetters.put(c,1);
                }
            }else{
                continue;
            }
        }
        //set to an arbitrary high value
        int possibleWords = s.length();
        //check how many times we can make target using the letters from string
        for (Map.Entry<Character,Integer> mapElement : targetLetters.entrySet()) {
            Character key = mapElement.getKey();
            
            if(!stringLetters.containsKey(key)){
                return 0;
            }else if( stringLetters.get(key) < targetLetters.get(key)){
                return 0;
            }

            int times = (int) stringLetters.get(key) / targetLetters.get(key);
            if(possibleWords > times){
                possibleWords = times;
            }
        }
            

        return possibleWords;


    }
}