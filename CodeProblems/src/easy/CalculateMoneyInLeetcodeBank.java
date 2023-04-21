package easy;

public class CalculateMoneyInLeetcodeBank {

    public int totalMoney(int n) {
        
        int sum = 0;
        int weekCount = 0;
        for(int i =1; i <=n; i++){
            
            int ammount = i % 7;
            if(ammount == 0){
                ammount = 7;
            }
            sum = sum + ammount + weekCount;
            
            if(ammount == 7){
                weekCount++;
            }

        }
        return sum;
    }
}