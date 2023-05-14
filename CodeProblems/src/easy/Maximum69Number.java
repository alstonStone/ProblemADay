package easy;

public class Maximum69Number {

    public int maximum69Number (int num) {
        int firstSixPosition = 0;
        boolean sixFound = false;
        String number = "" + num;
        for(Character c : number.toCharArray()){
            if(c =='6' && !sixFound){
                sixFound = true;
            }else if(sixFound){
                firstSixPosition++;
            }
        }
        if(sixFound){
            int sixPlace = (int) Math.pow(10,firstSixPosition);
            num = num - ( 6 * sixPlace);
            num = num + ( 9 * sixPlace);
        }
        return num;
    }

}

