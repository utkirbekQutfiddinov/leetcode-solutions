class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat=new int[m][n];
        for(int[] ind: indices){
            for(int i=0; i<n; i++){
                mat[ind[0]][i]++;
            }
            for(int i=0; i<m; i++){
                mat[i][ind[1]]++;
            }
        }

        int res=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]%2==1) res++;
            }
        }
        return res;
    }
}