package easy;

class PlusOne {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        }else{

            int[] newList;
            boolean allNines = true;
            for(int i =0; i< digits.length; i++){
                if( digits[i] != 9){
                    allNines = false;
                    break;
                }
            }
            if(allNines){
                newList = new int[digits.length +1];
                newList[0] = 1;
                return newList;
            }
            
            boolean adding = true;
            for(int i = digits.length-1; i>=0;i--){
                if(digits[i] == 9 && adding){
                    digits[i] = 0;
                }else if(adding){
                    digits[i] = digits[i] +1;
                    adding = false;
                    break;
                }
            }
            

        }


        return digits;
    }
}
