import java.util.ArrayList;

class Solution {



    public int calculate(String s) {
        String digitStorage = "";
        ArrayList<Character> symbols = new ArrayList<Character>();
        ArrayList<Integer> values = new ArrayList<Integer>();

        for(Character c : s.toCharArray()){
            if(isSymbol(c)){
                symbols.add(c);
                values.add(Integer.parseInt(digitStorage));
                digitStorage = "";
            }
            if(isDigit(c)){
                digitStorage = digitStorage + c;
            }
        }

        int value = 1;
        boolean running == true;
        while(running){
            Character lookingFor = lookingFor(value);
            int position = 0;
            for(Character c: symbols){
                if(c == lookingFor){
                    int total = opperationWithSymbol(values.get(position),values.get(position + 1),c);
                    System.out.println(total);
                    values.remove(position+1);
                    values.set(position, total);

                }
                position++;
            }

            value++;
            if(values.size() == 1){
                return values.get(0);
            }
        }


        System.out.println(isSymbol('/'));
        return values.get(0);
    }

    public static boolean isSymbol(Character c){
        switch(c) {
            case '+':
                return true;
            case '-':
                return true;
            case '*':
                return true;
            case '/':
                return true;
            default:
                return false;
        }
    }

    public static boolean isDigit(Character c){
        return Character.isDigit(c);
    }

    public static Character lookingFor(int symbolValue){
        switch(symbolValue) {
            case 1:
                return '*';
            case 2:
                return '/';
            case 3:
                return '+';
            case 4:
                return '-';
        }
        return null;
    }

    public static int opperationWithSymbol(int a, int b, Character c){
        switch(c) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }
}
