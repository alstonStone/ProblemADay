package easy;
import java.util.*;

public class VerifyingAnAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> alphabet = new HashMap<Character,Integer>();
        
        int count = 0;
        for(Character c : order.toCharArray()){
            alphabet.put(c,count);
            count++;
        }

        for(int i = 0; i < words.length; i++){
            String current = words[i];
            if(i+1 < words.length){
                String next = words[i+1];
                int size;
                if(current.length() > next.length()){
                    size = next.length();
                }else{
                    size = current.length();
                }
                boolean broke = false;
                for(int j = 0; j < size; j++){
                    char c = current.charAt(j);
                    char n = next.charAt(j);
                    if(c == n){
                        continue;
                    }else{
                        if(alphabet.get(c) < alphabet.get(n)){
                            broke = true;
                            break;
                        }else{
                            return false;
                        }
                    }
                }
                if(!broke && size == next.length()){
                    if(size == current.length()){
                        continue;
                    }
                    return false;
                }


            }
        }




        return true;
    }
}