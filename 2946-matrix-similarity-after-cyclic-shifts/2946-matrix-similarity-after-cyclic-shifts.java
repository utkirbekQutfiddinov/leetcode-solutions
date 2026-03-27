class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int rows=mat.length, cols=mat[0].length;
        for(int i=0; i<rows; i++){
            if(i%2==0){
                for(int j=0; j<cols; j++){
                    if(mat[i][j]!=mat[i][(j+k)%cols]){
                        return false;
                    }
                }
            }else {
                for(int j=0; j<cols; j++){
                    if(mat[i][j]!=mat[i][(cols+j-k%cols)%cols]){
                        return false;
                    }
                }
            }   
        }
        return true;
    }
}