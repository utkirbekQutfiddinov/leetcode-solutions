class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c || r==mat.length && c==mat[0].length){
            return mat;
        }
        int[] nums=new int[r*c];
        int ind=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                nums[ind++]=mat[i][j];
            }
        }

        mat=new int[r][c];
        for(int i=0; i<nums.length; i++){
            mat[i/c][i%c]=nums[i];
        }
        return mat;
    }
}