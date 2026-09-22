/*
{
    "history":[
        {"date":"22.09.2026", "type": "solving", "notes":"O(n^2)"}
    ]
}
 */

class Solution {
    public int minimumOperations(int[][] grid) {
        int res=0;
        for(int i=1; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]<=grid[i-1][j]){
                    int diff=grid[i-1][j]-grid[i][j]+1;
                    res+=diff;
                    grid[i][j]+=diff;
                }
            }
        }
        return res;
    }
}