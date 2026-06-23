class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing=true,decreasing=true;

        for(int i=0; i<nums.length-1; i++){
            increasing=increasing&&nums[i]<=nums[i+1];
            decreasing=decreasing&&nums[i]>=nums[i+1];
        }

        return increasing || decreasing;
    }
}