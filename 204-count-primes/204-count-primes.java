class Solution {
    public int countPrimes(int n) {
        if(n<=1) return 0;
        int res=0;
        boolean[] nums=new boolean[n];
        for(int i=2; i<nums.length; i++){
            if(nums[i]==false){
                res++;
                for(int j=2*i; j<nums.length; j+=i)
                    nums[j]=true;
            }
        }
        return res;
            
    }
}