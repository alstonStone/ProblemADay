package easy;
import java.util.HashMap;
import java.util.Map;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

public class RomanToInteger {



    Map<Character, Integer> values = new HashMap<Character, Integer>() {{
    	put('I', 1);
    	put('V', 5);
    	put('X', 10);
    	put('L', 50);
    	put('C', 100);
    	put('D', 500);
    	put('M', 1000);
        
    }};





    public int romanToInt(String s) {
    	int answer = 0;
        char[] chars = toCharArray(s);

        for(int c = 0; c < chars.length; c++) {
        	int currentValue;

        	if(c+1 < chars.length) {
        		currentValue = calculateSubtraction(chars[c],chars[c+1]);
        		if(currentValue != 0) {
        			answer += currentValue;
        			c++;
        			continue;
        		}
        	}
        	currentValue = values.get(chars[c]);
        	answer += currentValue;
        }
        
        
        return answer;

    }

    private char[] toCharArray(String s){
        char[] answer = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            answer[i] = s.charAt(i);
        }
         return answer;
    }

    private int calculateSubtraction(char c1, char c2){
		  	
    	if(c1 == 'I') {
        	switch(c2) {
	      	  case 'V':
	      	    return 4;
	      	  case 'X':
	      	    return 9;
	      	}
    	}
    	if(c1 == 'X') {
        	switch(c2) {
	      	  case 'L':
	      		  return 40;
	      	  case 'C':
	      		  return 90;
	      	}
    	}
    	if(c1 == 'C') {
        	switch(c2) {
	      	  case 'D':
	      		  return 400;
	      	  case 'M':
	      		  return 900;
	      	}
    	}
       	
    	return 0;
    }

    public void run() {
    	String test = "IX";
    	char[] print = toCharArray(test);
    	for(int i  = 0; i < print.length; i++) {
    		if(i+1 < print.length) {
    			System.out.println(calculateSubtraction(print[i],print[i+1]));
    		}
    		
    	}
    }






}
