class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        //from 0 to n-1
        int a=nums[0], b=Math.max(nums[0],nums[1]);
        for(int i=2; i<nums.length-1; i++){
            int curr=Math.max(a+nums[i],b);
            a=b;
            b=curr;
        }

        int res=b;
        //from 1 to n
        a=nums[1];
        b=Math.max(nums[1],nums[2]);
        for(int i=3; i<nums.length; i++){
            int curr=Math.max(a+nums[i],b);
            a=b;
            b=curr;
        }

        return Math.max(res,b);
    }
}