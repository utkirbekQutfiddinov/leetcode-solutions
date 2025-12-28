class Solution {
    public int countNegatives(int[][] grid) {
        int count=0; 

        for(int[] row: grid){
            for(int cell: row){
                if(cell<0){count++;}
            }
        }
        return count;
    }
}