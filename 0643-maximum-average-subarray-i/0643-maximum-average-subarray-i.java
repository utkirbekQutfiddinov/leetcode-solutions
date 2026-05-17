class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,res=Double.MIN_VALUE;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        res=sum;
        for(int right=k; right<nums.length; right++){
            sum-=nums[right-k];
            sum+=nums[right];
            res=Math.max(res,sum);
        }
        return res/k;
    }
}