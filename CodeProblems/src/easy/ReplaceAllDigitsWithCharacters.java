package easy;

public class ReplaceAllDigitsWithCharacters {

    public String replaceDigits(String s) {
        String answer = "";
        for(int i =1 ; i < s.length(); i +=2){
            answer =  answer + s.charAt(i-1);
            answer =  answer + shift(s.charAt(i-1), Character.getNumericValue(s.charAt(i)));
        }
        if(answer.length() < s.length()){
            answer = answer+s.charAt(s.length() -1);
        }
        return answer;
    }

    public char shift(char start, int shift){
            char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z'};
            int index =0;
            for(Character c: letters){
                if(c!=start){
                    index++;
                }else{
                    break;
                }
            }      
            return letters[index+shift];
    }

}