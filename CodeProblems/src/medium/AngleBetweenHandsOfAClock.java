package medium;

public class AngleBetweenHandsOfAClock {
	
    public double angleClock(int hour, int minutes) {
        double answer = 0;
        double degreesPerMinute = 360 / 60;
        double degreesPerHour = 5 * degreesPerMinute;

        double hourHandDegrees = (hour * degreesPerHour) + ((minutes / 12.00)*(6));
    

        answer = Math.abs(hourHandDegrees - (minutes * degreesPerMinute));
        if(answer > 180){
            answer = 360 - answer;
        }
        return answer; 
    }
}