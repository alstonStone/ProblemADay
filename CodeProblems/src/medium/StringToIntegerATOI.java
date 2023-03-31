package medium;

import java.util.*;

public class StringToIntegerATOI {

    public int myAtoi(String s) {

        boolean negative = false;
        boolean atNumber = false;

        HashMap<Character,Integer> numbers = new HashMap<Character,Integer>();
        numbers.put('0',0);
        numbers.put('1',1);
        numbers.put('2',2);
        numbers.put('3',3);
        numbers.put('4',4);
        numbers.put('5',5);
        numbers.put('6',6);
        numbers.put('7',7);
        numbers.put('8',8);
        numbers.put('9',9);

        int sum = 0;
        int oldSum = 0;

        for(Character c : s.toCharArray()){
            if(atNumber){
                if(numbers.containsKey(c)){
                    oldSum = sum;
                    sum = (sum * 10) + numbers.get(c);
                }else{
                    break;
                }
            }else{
                if(c == ' '){
                    continue;
                }else if(c == '-'){
                    negative = true;
                    atNumber = true;
                    continue;
                }else if(c == '+'){
                    atNumber = true;
                    continue;
                }else if(numbers.containsKey(c)){
                    oldSum = sum;
                    sum = (sum * 10) + numbers.get(c);
                    atNumber = true;
                    continue;
                }else{
                    break;
                }
            }
            if(oldSum > (sum / 10)){
                if(negative){
                    return -2147483648;
                }else{
                    return 2147483647;
                }
            }
        }

        if(negative){
            sum = sum * -1;
        }

        return sum;
        
    }
}