class Solution {
    public int dominantIndices(int[] nums) {
        int sum=0, count=0, res=0;
        for(int i=nums.length-1; i>=0; i--){
            if(count>0 && 1.0*nums[i]>sum/count){
                res++;
            }
            count++;
            sum+=nums[i];
        }
        return res;
    }
}