package easy;

public class ClimbingStairs {

    public int climbStairs(int n) {
        if( n == 1){
            return 1;
        }
        if( n == 2){
            return 2;
        }

        int prev = 1;
        int current = 2;
        for(int i = 3; i <= n; i++){
            int temp = current;
            current = prev + current;
            prev = temp;
        }

        return current;


    }

}
