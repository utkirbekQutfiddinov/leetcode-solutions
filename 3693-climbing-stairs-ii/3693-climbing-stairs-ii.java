class Solution {
    public int climbStairs(int n, int[] costs) {
        int a3=Integer.MAX_VALUE/2, a2=Integer.MAX_VALUE/2, a1=0;

        for(int i=1; i<=n; i++){
            int curr=costs[i-1]+1+a1;
            curr=Math.min(curr, costs[i-1]+4+a2);
            curr=Math.min(curr, costs[i-1]+9+a3);
            a3=a2;
            a2=a1;
            a1=curr;
        }

        return a1;
    }
}