class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Map<Integer, List<int[]>> map=new HashMap<>();
        Set<Integer> dist=new TreeSet<>();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int d=Math.abs(i-rCenter)+Math.abs(j-cCenter);
                dist.add(d);
                List<int[]> list=map.getOrDefault(d,new ArrayList<>());
                list.add(new int[]{i,j});
                map.put(d,list);
            }
        }

        int[][] result=new int[rows*cols][];
        
        int ind=0;
        for(Integer d: dist){
            List<int[]> list=map.get(d);
            for(int[] point: list){
                result[ind++]=point;
            }
        }
        return result;
        
    }
}