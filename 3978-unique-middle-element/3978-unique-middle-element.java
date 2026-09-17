class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        for(int i=0; i<nums.length/2; i++){
            if(nums[i]==nums[nums.length/2] || nums[nums.length-i-1]==nums[nums.length/2]) return false;
        }
        return true;
    }
}