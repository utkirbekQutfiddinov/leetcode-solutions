class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean res=true;
        if(nums.length==1) return res;
        else if(nums[0]<=nums[nums.length-1])
        for(int i=0; i<nums.length-1; i++)
            res=res&&nums[i]<=nums[i+1];
        else for(int i=0; i<nums.length-1; i++)
            res=res&&nums[i]>=nums[i+1];
        return res;
    }
}