package easy;
import java.util.*;

public class ValidParentheses {

    public boolean isValid(String s) {
        
        Stack<Character> pOrder = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);

            switch(currentChar){
                case '(':
                    pOrder.push(currentChar);
                    break;
                case '[':
                    pOrder.push(currentChar);
                    break;
                case '{':
                    pOrder.push(currentChar);
                    break;
                case ')':
                    if(pOrder.empty()){
                        return false;
                    }
                    if(pOrder.peek() != '('){
                        return false;
                    }
                    pOrder.pop();
                    break;
                case ']':
                    if(pOrder.empty()){
                        return false;
                    }
                    if(pOrder.peek() != '['){
                        return false;
                    }
                    pOrder.pop();
                    break;
                case '}':
                    if(pOrder.empty()){
                        return false;
                    }
                    if(pOrder.peek() != '{'){
                        return false;
                    }
                    pOrder.pop();
                    break;

            }
        }
        if(pOrder.empty()){
            return true;
        }


        return false;
    }


}