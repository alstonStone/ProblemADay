package easy;

import java.util.HashMap;

public class BestPokerHand {

    public String bestHand(int[] ranks, char[] suits) {
        if(isFlush(ranks,suits)){
            return "Flush";
        }
        if(isThreeOf(ranks,suits)){
            return "Three of a Kind";
        }
        if(isPair(ranks,suits)){
            return "Pair";
        }
        return "High Card";
    }

    public static boolean isFlush(int[] ranks, char[] suits){
        for(int i = 1; i < suits.length; i++){
            if(suits[i] != suits[0]){
                return false;
            }
        }
        return true;
    }

    public static boolean isThreeOf(int[] ranks, char[] suits){
        HashMap<Integer, Integer> cardRanks = new HashMap<Integer, Integer>();
        for(int i = 0; i < suits.length; i++){
            if(cardRanks.containsKey(ranks[i])){
                cardRanks.replace(ranks[i], cardRanks.get(ranks[i]) +1);
            }else{
                cardRanks.put(ranks[i], 1);
            }
        }
        if(cardRanks.containsValue(3) || cardRanks.containsValue(4)){
            return true;
        }
        return false;
    }
    public static boolean isPair(int[] ranks, char[] suits){
        HashMap<Integer, Integer> cardRanks = new HashMap<Integer, Integer>();
        for(int i = 0; i < suits.length; i++){
            if(cardRanks.containsKey(ranks[i])){
                cardRanks.replace(ranks[i], cardRanks.get(ranks[i]) +1);
            }else{
                cardRanks.put(ranks[i], 1);
            }
        }
        if(cardRanks.containsValue(2)){
            return true;
        }
        return false;
    }
    
}