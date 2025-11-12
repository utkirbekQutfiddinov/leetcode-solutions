class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum=0, maxSum=0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }

        maxSum=sum;

        for(int i=k; i<nums.length; i++){
            sum=sum-nums[i-k]+nums[i];
            maxSum=Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
        double resp=1.0*maxSum/k;
        return resp;
    }
}