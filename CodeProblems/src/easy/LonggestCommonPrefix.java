package easy;

public class LonggestCommonPrefix {

	   public String longestCommonPrefix(String[] strs) {
	        
	        

	        int prefixLength = 0;
	        String first = strs[0];
	        String prefix = "";
	        
	        //check against every string, start at second string
	        for(int i = 1; i< strs.length; i++) {
	        	String currentString = strs[i];
               if(currentString.isEmpty()) {
                   return "";
               }
	        	int count;
	        	for(count = 0; count < 200; count++) {

                  if(count >= first.length() || count >= currentString.length() ){
                      break;
                  }               
                  if(first.charAt(count) != currentString.charAt(count) ) {
                       if(count == 0) {
                           return "";
                       }
                  	break;
                  }  
	        	}
	        	if(prefixLength == 0) {
	        		prefixLength = count;
	        	}
	        	if(count < prefixLength) {
	        		prefixLength = count;
	        	}
	        }
	        if(prefixLength != 0) {
	        	for(int i = 0; i < prefixLength; i++) {
	        		prefix += first.charAt(i);
	        	}
	        }
	        else {
              if(first.length() > 0){
                  prefix += first.charAt(0);
              }	
	        }
	        

	        return prefix;

	    }
	}