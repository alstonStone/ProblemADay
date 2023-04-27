package easy;

public class NumberOfStringsThatAppearAsSubstringsInWord {

    public int numOfStrings(String[] patterns, String word) {
        int total = 0;
        for(int i = 0; i < patterns.length; i++){
            if(word.contains(patterns[i])){
                total++;
            }
        }
        return total;  
    }
}