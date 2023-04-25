package easy;

public class SumOfAllOddLengthSubarrays {

    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;    
        int subSize = 1;
        for(Integer i : arr){
            sum = sum +i;
        }
        subSize = subSize +2;
        while(subSize <= arr.length){
            int position = 0;
            while(position <= arr.length - subSize){
                int[] subSet = new int[subSize];
                int count = 0;
                for(int i = position; count < subSize; i++){
                    subSet[count] = arr[i];
                    count++;
                }
                for(Integer i: subSet){
                    sum = sum + i;
                }
                System.out.println(sum);
                position++;
            }
            subSize = subSize + 2;
        }
        return sum;
    }
    
}