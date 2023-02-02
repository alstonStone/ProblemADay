package easy;
import java.util.ArrayList;

//Given an integer x, return true if x is a palindrome, and false otherwise.
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
        }
     	ArrayList<Integer> digits = numberToDigits(x);
     	
     	for(int i = 0; i < digits.size(); i++) {
     		//compare index to index
     		if(digits.get(i) != digits.get(digits.size() - 1 - i)) {
     			return false;
     		}
     	}
        return true;	
    }

     public ArrayList<Integer> numberToDigits(int number){
 		
     	ArrayList<Integer> returnList = new ArrayList<Integer>();
     	while(number >= 1) {
     		returnList.add(number % 10);
     		number = number / 10;
     	}
     	return returnList;
     }

	public void run() {
		int testNum = 1233211;
		System.out.print(isPalindrome(testNum));
		
	}
}
