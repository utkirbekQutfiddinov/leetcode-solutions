class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int[] rows=new  int[matrix.length];
        for(int i=0; i<rows.length; i++){
            rows[i]=Integer.MAX_VALUE;
        }
        int[] cols=new int[matrix[0].length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                rows[i]=Math.min(rows[i],matrix[i][j]);
                cols[j]=Math.max(cols[j],matrix[i][j]);
            }
        }
        List<Integer> result=new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==rows[i] && matrix[i][j]==cols[j]) result.add(matrix[i][j]);
            }
        }
        return result;
    }
}