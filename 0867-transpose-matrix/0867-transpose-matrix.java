class Solution {
    public int[][] transpose(int[][] m) {
        int[][] res=new int[m[0].length][m.length];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                res[j][i]=m[i][j];
            }
        }
        return res;
    }
}