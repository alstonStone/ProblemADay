package easy;

public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int area = 0;
        
        for(int i = 0 ; i < grid.length; i ++){
            for(int j = 0; j < grid[i].length; j ++){

                if(grid[i][j] == 1){
                    area += 4;
                    area -= neighbors(grid, i, j);
                }
            }
        }
        return area;
    }

    public int neighbors(int[][] grid, int x, int y){
        int neighbors = 0;

        if(x - 1 >= 0){
            if(grid[x-1][y] == 1){
                neighbors++;
            }
       }
        if(x + 1 < grid.length){
            if(grid[x+1][y] == 1){
                neighbors++;
            }  

        }
        if(y - 1 >= 0 ){
            if(grid[x][y-1] == 1){
                neighbors++;
            }
        }
        if(y + 1 < grid[x].length){
            if(grid[x][y+1] == 1){
                neighbors++;
            }
        }      
        return neighbors;
    }
    
}