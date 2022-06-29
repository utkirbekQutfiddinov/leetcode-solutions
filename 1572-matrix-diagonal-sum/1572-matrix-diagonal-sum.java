class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int l=0,r=n-1,i=0;
        int res=0;
        while(l<=r){
            res+=mat[i][l++]+mat[i++][r--];
        }
        while(r>=0){
            res+=mat[i][l++]+mat[i++][r--];
        }
        if(n%2!=0) res-=mat[n/2][n/2];
        return res;
    }
}