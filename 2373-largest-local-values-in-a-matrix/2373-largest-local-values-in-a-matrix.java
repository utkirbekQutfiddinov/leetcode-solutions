class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] res=new int[grid.length-2][grid.length-2];
        
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                res[i][j]=maks(grid,i,j);
            }
        }
        
        return res;
    }
    
    private int maks(int[][] a, int r, int c){
        int res=a[r][c];
        
        for(int i=r; i<=r+2; i++){
            for(int j=c; j<=c+2; j++){
                if(a[i][j]>res){
                    res=a[i][j];
                }
            }
        }
        
        return res;
    }
}