class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int result=1, curr=1;
        int el=nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]>el){
                curr++;
             }else {
                curr=1;
            }    
            result=Math.max(curr,result);
            el=nums[i];
        }

        return result;
    }
}