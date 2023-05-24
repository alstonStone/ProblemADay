



class CountTheNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int sum = 0;
        for(String s : words){
            boolean status = true;
            for(Character c: s.toCharArray()){
                if(!contains(allowed,c)){
                    status = false;
                    break;
                }
            }
            if(status){
                sum++;
            }
        }
        return sum;
    }



    public boolean contains(String allowed, char letter){
        for(Character c: allowed.toCharArray()){
            if(c == letter){
                return true;
            }
        }
        return false;
    }



}
