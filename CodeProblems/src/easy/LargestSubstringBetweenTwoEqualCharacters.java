
package easy;


class LargestSubstringBetweenTwoEqualCharacters{


    public int maxLengthBetweenEqualCharacters(String s) {
        int largest = -1;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            for(int j = 0; j < s.length(); j++){
                char check = s.charAt(j);
                if(check == c){
                    if( (j-i) -1 > largest){
                        largest = (j-i) -1;
                    }
                }
            }
        }
        return largest;
    }


}
