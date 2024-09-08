class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];

        for(int i=0; i<=n; i++){
            ans[i]=numOfOnes(i);
        }

        return ans;
    }

    private int numOfOnes(int n){
        int res=0;
        while(n!=0){
            if(n%2==1){
                res++;
            }
            n=n>>1;
        }
        return res;
    }
}