class Solution {
    public int projectionArea(int[][] grid) {
        int area=0;
        List<Integer> list=new ArrayList<>();
        int rowMax=0;

        for(int i=0; i<grid.length; i++){
            rowMax=grid[i][0];
            for(int j=0; j<grid[i].length; j++){
                if(list.size()-1<j){
                    list.add(grid[i][j]);
                }else{
                    Integer max = list.get(j);
                    max=Math.max(max, grid[i][j]);
                    list.set(j,max);
                }
                rowMax=Math.max(rowMax, grid[i][j]);
                if(grid[i][j]>0) area++;
            }
            area+=rowMax;
        }

        for(Integer num: list){
            area+=num;
        }

        return area;
    }
}