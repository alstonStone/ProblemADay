package easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        int answer = -1;
        for(int i = 0; i< haystack.length(); i++){
                if(haystack.charAt(i) == needle.charAt(0)){
                    int count = i;
                    answer = count;
                    boolean match = true;

                    for(Character c: needle.toCharArray()){
                        if(count >= haystack.length()){
                            match = false;
                            break;
                        }
                        if(haystack.charAt(count) == c ){
                            count++;
                            continue;
                        }else{
                            match = false;
                            break;
                        }
                    }
                    if(match){
                        return answer;
                    }else{
                        answer = -1;
                    }
                }
        }
        return answer;
    }
}