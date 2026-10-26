class Solution {
    public int countIslands(int[][] grid, int k) {
        int res=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]>0){
                    long sum=getIslandSum(grid,i,j);
                    if(sum%k==0) res++;
                }
            }
        }
        return res;
    }

    private long getIslandSum(int[][] grid, int i, int j){
        if(grid[i][j]<=0) return 0;
        long s=0;
        s+=grid[i][j];
        grid[i][j]=0;
        if(i>0) s+=getIslandSum(grid, i-1, j);
        if(i<grid.length-1) s+=getIslandSum(grid, i+1, j);
        if(j>0) s+=getIslandSum(grid, i, j-1);
        if(j<grid[i].length-1) s+=getIslandSum(grid, i, j+1);
        return s;
    }
}