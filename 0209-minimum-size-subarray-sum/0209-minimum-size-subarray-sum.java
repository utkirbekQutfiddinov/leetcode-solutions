class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,left=0,res=-1;

        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            while(sum>=target){
                if(res==-1){
                    res=i-left+1;
                }else {
                    res=Math.min(res,i-left+1);
                }
                sum-=nums[left];
                left++;
            }
        }
        if(sum>=target){
                if(res==-1){
                    res=nums.length-left+1;
                }else {
                    res=Math.min(res,nums.length-left+1);
                }
                sum-=nums[left];
                left++;
            }
        return res==-1?0:res;
    }
}