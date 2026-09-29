class Solution {
    public int surfaceArea(int[][] grid) {
        int area=0, left=0, right=0, front=0, back=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(i==0){
                    back=0;
                }else{
                    back=grid[i-1][j];
                }

                if(grid[i][j]>back){
                    area+=grid[i][j]-back;
                }

                if(i==grid.length-1){
                    front=0;
                }else{
                    front=grid[i+1][j];
                }

                if(grid[i][j]>front){
                    area+=grid[i][j]-front;
                }


                if(j==0){
                    left=0;
                }else{
                    left=grid[i][j-1];
                }
                
                if(grid[i][j]>left){
                    area+=grid[i][j]-left;
                }


                if(j==grid[i].length-1){
                    right=0;
                }else{
                    right=grid[i][j+1];
                }
                
                if(grid[i][j]>right){
                    area+=grid[i][j]-right;
                }

                if(grid[i][j]>0){
                    area+=2;
                }
            }
        }

        return area;
    }
}