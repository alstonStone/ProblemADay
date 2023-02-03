
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

class RomanToInteger {


    HashMap<Character, Integer> values = new HashMap<Character, Integer>();
    values.put('I', 1);
    values.put('V', 5);
    values.put('X', 10);
    values.put('L', 50);
    values.put('C', 100);
    values.put('D', 500);
    values.put('M', 1000);




    public int romanToInt(String s) {
        char chars = toCharArray(s);
        System.out.println(chars);
        return 0;
    }

    private char[] toCharArray(String s){
        char[] answer = new char[s.length];
        for(int i = 0; i < s.length; i++){
            char[i] = s.charAt(i);
        }
         return answer;
    }

    private boolean checkNext(char c1, char c2){

    }


    private int calculateSubtraction(char c1, char c2){

    }








}
