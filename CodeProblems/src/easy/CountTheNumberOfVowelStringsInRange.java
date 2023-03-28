package easy;
import java.util.*;

public class CountTheNumberOfVowelStringsInRange {

    public int vowelStrings(String[] words, int left, int right) {
        
        int answer = 0;

        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for(int i = left; i <= right; i ++){
            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);

            if(vowels.contains(first) && vowels.contains(last)){
                answer++;
            }

        }

        return answer;
    }
}