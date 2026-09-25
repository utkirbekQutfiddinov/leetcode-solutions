class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int len=nums.length;
        int res=Math.abs(nums[0]-nums[len-1]);
        for(int i=0; i<len-1; i++){
            res=Math.max(Math.abs(nums[i]-nums[i+1]),res);
        }
        return res;
    }
}