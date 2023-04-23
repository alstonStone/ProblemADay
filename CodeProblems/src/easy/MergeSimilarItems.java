package easy;

import java.util.*;

public class MergeSimilarItems {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> items = new HashMap<Integer,Integer>();
        for(int i = 0; i < items1.length; i++){
            items.put(items1[i][0],items1[i][1]);
        }
        for(int i = 0; i < items2.length; i++){
            if(items.containsKey(items2[i][0])){
                items.replace(items2[i][0], items.get(items2[i][0]) + items2[i][1]);
            }else{
                items.put(items2[i][0],items2[i][1]);
            }
        }
        List answer = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : items.entrySet()){
            ArrayList<Integer> input = new ArrayList<Integer>();
            input.add(entry.getKey());
            input.add(entry.getValue());
            answer.add(input);
        }
        Collections.sort(answer, new Comparator<List<Integer>> () {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                return a.get(0).compareTo(b.get(0));
            }
        });
        return answer;
    }
}