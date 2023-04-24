package easy;

import java.util.HashSet;

public class PathCrossing {

    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        HashSet<String> visitedPoints = new HashSet<String>();
        visitedPoints.add("0,0");
        for(Character c: path.toCharArray()){
            switch(c){
                case 'N':
                        y++;
                    break;
                case 'S':
                        y--;
                    break;

                case 'E':
                        x++;
                    break;
                case 'W':
                        x--;
                    break;
            }
            String currentLocation = ""+x+","+y;
            if(visitedPoints.contains(currentLocation)){
                return true;
            }else{
                visitedPoints.add(currentLocation);
            }
        }
        return false;  
    }

}