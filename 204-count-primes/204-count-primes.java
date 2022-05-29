class Solution {
    public int countPrimes(int n) {
        if(n<=1) return 0;
        boolean[] nums=new boolean[n];
        for(int i=2; i<nums.length; i++){
            if(nums[i]==false)
                for(int j=2*i; j<nums.length; j+=i)
                    nums[j]=true;
        }
        
        int res=0;
        for(int i=2; i<nums.length; i++)
            if(nums[i]==false) res++;
        return res;
            
    }
}