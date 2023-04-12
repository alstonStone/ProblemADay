package easy;

import java.util.*;

public class KeyboardRow {

    public String[] findWords(String[] words) {
        
        ArrayList<String> answer = new ArrayList<String>();

        HashSet<Character> first = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        HashSet<Character> second = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        HashSet<Character> third = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));

        for(String s : words){
            String lowerS = s.toLowerCase();
            char row = lowerS.charAt(0);
            if(first.contains(row)){
                row = 'f';
            }else if(second.contains(row)){
                row = 's';
            }else if(third.contains(row)){
                row = 't';
            }else{
                break;
            }

            boolean status = true;
            for(int i = 0; i < lowerS.length(); i++){
                char current = lowerS.charAt(i);
                switch (row) {
                    case 'f':
                        if(first.contains(current)){
                            continue;
                        }else{
                            status = false;
                        }
                        break;
                    case 's':
                        if(second.contains(current)){
                            continue;
                        }else{
                            status = false;
                        }
                        break;
                    case 't':
                        if(third.contains(current)){
                            continue;
                        }else{
                            status = false;
                        }
                        break;
                }
            }
            if(status == true){
                answer.add(s);
            }
        }

        return answer.toArray(new String[answer.size()]);

    }
}