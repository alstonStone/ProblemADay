package easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        

        String answer = "";

        int aCount = 0;
        int bCount = 0;

        char curA = 'a';
        char curB = 'b';
        
        boolean working =  true;
        boolean carry = false;

        while( working){

            if(aCount >= a.length() || bCount >= b.length()){
                if(aCount > a.length() && bCount > b.length()){
                    working = false;
                    break;
                }else if(aCount >= a.length()){
                    while(bCount < b.length()){
                        curB = b.charAt(b.length() -1  - bCount);
                        if(carry){
                            if(curB == '1'){
                                answer = '0'+answer;
                            }else{
                                answer = '1'+answer;
                                carry = false;
                            }
                        }else{
                            answer = curB + answer;
                        }
                        bCount++;
                    }
                    working = false;
                    break;
                }else if(bCount >= b.length()){
                     while(aCount < a.length()){
                        curA = a.charAt(a.length() -1  - aCount);
                        if(carry){
                            if(curA == '1'){
                                answer = '0'+answer;
                            }else{
                                answer = '1'+answer;
                                carry = false;
                            }
                        }else{
                            answer = curA + answer;
                        }
                        aCount++;
                    }
                    working = false;
                    break;
                }
            }else{
                curA = a.charAt(a.length() -1  - aCount);
                curB = b.charAt(b.length() -1  - bCount);
                aCount++;
                bCount++;
            }


            if(curA == '1' && curB == '1'){
                if(carry){
                    answer = '1'+answer;
                    carry = true;
                    continue;
                }else{
                    answer = '0'+answer;
                    carry = true;
                    continue;
                }
            }else if((curA == '1' || curB == '1') && carry){
                    answer = '0'+answer;
                    carry = true;
                    continue;
            }else if(curA == '1' || curB == '1'){
                    answer = '1'+answer;
                    carry = false;
                    continue;
            }else if((curA == '0' && curB == '0') && carry){
                    answer = '1'+answer;
                    carry = false;
                    continue;
            }else if(curA == '0' && curB == '0'){
                    answer = '0'+answer;
                    carry = false;
                    continue;
            }

        }
        if(carry){
            answer = '1'+answer;
        }

    return answer;

    }

}