package easy;

public class LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        
        int nameCount = 0;
        int typedCount = 0;
        char prevChar = name.charAt(0);
        boolean answer = true;

        while(typedCount < typed.length()){
            
            if(nameCount >= name.length()){
                nameCount--;
            }

            if(name.charAt(nameCount) != typed.charAt(typedCount)){
                if(prevChar != typed.charAt(typedCount)){
                    return false;
                }else{
                    typedCount++;
                }
            }else{
                prevChar = name.charAt(nameCount);
                nameCount++;
                typedCount++;
            }
        }
        if(typedCount < name.length() || nameCount < name.length()){
            return false;
        }else if(name.charAt(name.length() -1) != typed.charAt(typed.length() -1)){
            return false;
        }

        return answer;
    }
}