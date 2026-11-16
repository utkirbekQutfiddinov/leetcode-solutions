class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(robRange(nums,0,nums.length-2),robRange(nums,1,nums.length-1));
    }

    private int robRange(int[] nums, int from, int to){
        if(from==to) return nums[from];
        if(from>to) return 0;
        int a=nums[from], b=Math.max(nums[from],nums[from+1]);
        for(int i=from+2; i<=to; i++){
            int curr=Math.max(a+nums[i], b);
            a=b;
            b=curr;
        }
        return b;
    }
}