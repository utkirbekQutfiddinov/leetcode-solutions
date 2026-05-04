class Solution {
    public int islandPerimeter(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                grid[i][j]*=4;
            }
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){

                if(grid[i][j]>0){
                    if(i>0){//not the top row
                    grid[i-1][j]--;    
                    }

                if(i<grid.length-1){//not the bottom row
                    grid[i+1][j]--;    
                }

                if(j>0){//not the leftmost column
                    grid[i][j-1]--;
                }
                
                if(j<grid[i].length-1){//not the rightmost column
                    grid[i][j+1]--;
                }
                }
                
            }
        }

        int perimeter=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]>0){
                    perimeter+=grid[i][j];
                }
            }
        }

        return perimeter;
    }
}