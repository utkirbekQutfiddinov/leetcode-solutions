class Solution {
    public int[] minCosts(int[] cost) {
        int[] res=new int[cost.length];
        int num=cost[0];
        for(int i=0; i<cost.length; i++){
            num=Math.min(num, cost[i]);
            res[i]=num;
        }
        return res;
    }
}