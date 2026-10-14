class Solution {
    public boolean isBoomerang(int[][] points) {
        Set<String> set=new HashSet<>();
        
        for(int[] point: points){
            if(set.contains(point[0]+":"+point[1])) return false;
            set.add(point[0]+":"+point[1]);
        }
        
        return (points[1][1] - points[0][1]) * (points[2][0] - points[1][0]) != (points[2][1] - points[1][1]) * (points[1][0] - points[0][0]);
    }
}