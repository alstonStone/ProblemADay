package easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        for(int i=0; i <(int)s.length()/2; i++){
            if(s.charAt(i) != s.charAt((s.length()-1) -i)){
                return false;
            }
        }
        return true;
    }
}