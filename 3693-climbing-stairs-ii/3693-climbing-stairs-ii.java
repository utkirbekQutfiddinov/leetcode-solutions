class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] res=new int[n+1];
        for(int i=1; i<res.length; i++){
            res[i]=res[i-1]+1;

            if(i>1){
                res[i]=Math.min(res[i],res[i-2]+4);
            }
            if(i>2){
                res[i]=Math.min(res[i],res[i-3]+9);
            }
            res[i]+=costs[i-1];
        }

        return res[n];
    }
}