class Solution {
    public int countPrimes(int n) {
        if(n<=1) return 0;
        int res=0;
        boolean[] nums=new boolean[n];
        for(int i=2; i*i<n; i++){
            if(nums[i]==false)
                {
                for(int j=i*i; j<n; j+=i)
                    nums[j]=true;
            }
        }
        for(int i=2; i<n; i++)
            if(!nums[i])res++;
        return res;
            
    }
}