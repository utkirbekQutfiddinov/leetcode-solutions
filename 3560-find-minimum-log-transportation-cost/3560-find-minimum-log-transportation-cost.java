class Solution {
    public long minCuttingCost(int n, int m, int k) {
        long cost=0;
        if(n>k){
            cost=cost+(long)k*(n-k);
        }
        if(m>k){
            cost=cost+(long)k*(m-k);
        }
        return cost;
    }
}