



class CountTheNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {

        int sum = 0;
        for(int i=0;i<words.length;i++){
            boolean status = true;
            for(int j=0;j<words[i].length();j++){
                if(!contains(allowed,words[i].charAt(j))){
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
        for(int i=0;i<allowed.length();i++){
            if(allowed.charAt(i) == letter){
                return true;
            }
        }
        return false;
    }

}
}
