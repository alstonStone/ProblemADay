package easy;

public class FindFirstPalindromicStringInTheArray {

    public String firstPalindrome(String[] words) {

        for(String s: words){
            if(isPalindrome(s)){
                return s;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String s){

        int start = 0;
        int end = s.length() -1;

        for(int i = start; i < s.length() / 2; i++){
            if(s.charAt(start + i) == s.charAt(end -i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

}