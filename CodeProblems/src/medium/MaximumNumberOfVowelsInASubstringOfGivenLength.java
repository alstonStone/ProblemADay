package medium;

import java.util.*;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public int maxVowels(String s, int k) {

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        Deque<Character> subString = new ArrayDeque<>();
        int count=0;
        int max = 0;

        for(Character c: s.toCharArray()){
            if(vowels.contains(c)){
                count++;
            }
            subString.addLast(c);
            if(subString.size() > k){
                if(vowels.contains(subString.pollFirst())){
                    count--;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}