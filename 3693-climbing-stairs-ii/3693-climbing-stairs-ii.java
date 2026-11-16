class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] res=new int[n+1];
        res[0]=0;

        for(int i=1; i<=n; i++){
            res[i]=res[i-1]+costs[i-1]+1;

            if(i-2>=0) res[i]=Math.min(res[i], res[i-2]+costs[i-1]+4);
            if(i-3>=0) res[i]=Math.min(res[i], res[i-3]+costs[i-1]+9);
        }

        return res[n];
    }
}