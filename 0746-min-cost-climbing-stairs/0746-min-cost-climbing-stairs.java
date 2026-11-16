class Solution {
    public int minCostClimbingStairs(int[] costs) {
        int a=0;//i-2 
        int b=0; //i-1
        for(int i=2; i<=costs.length; i++){
            int curr=Math.min(costs[i-2]+a, b+costs[i-1]);
            a=b;
            b=curr;
        }

        return b;
    }
}