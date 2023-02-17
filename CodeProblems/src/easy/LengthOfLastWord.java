package easy;

public class LengthOfLastWord {


    public int lengthOfLastWord(String s) {

        int count = 0;
        int lastCount = count;
        boolean counting = false;
        for(int i = 0; i < s.length(); i ++){
            
            if(s.charAt(i) != ' '){
                counting = true;
                count++;
            }else if(s.charAt(i) == ' ' && counting){
                lastCount = count;
                count = 0;
                counting = false;
            }

        }

        if(count == 0){
            return lastCount;
        }
        return count;



    }
	
}
