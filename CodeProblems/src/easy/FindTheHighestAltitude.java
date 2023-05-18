package easy;

public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;

        for(int i = 0; i<gain.length; i++){
            altitude = altitude + gain[i];
            if(altitude > max){
                max = altitude;
            }
        }
        return max;
    }

}
