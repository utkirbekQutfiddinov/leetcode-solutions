class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> res=new ArrayList<>();
        boolean skip=false;

        for(int i=0; i<grid.length; i++){
            if(i%2==0){
                for(int j=0; j<grid[i].length; j++){
                    if(!skip){
                        res.add(grid[i][j]);
                    }
                    skip=!skip;
                }
            }else{
                for(int j=grid[i].length-1; j>=0; j--){
                    if(!skip){
                        res.add(grid[i][j]);
                    }
                    skip=!skip;
                }
            }
        }
        return res;
    }
}