class Solution {
    public boolean canJump(int[] nums) {
        int jump=nums[0];

        for(int i=0; i<nums.length; i++){
            if(i==nums.length-1){
                return true;
            }
            jump--;
            if(nums[i]>jump){
                jump=nums[i];
            }
            
            if(jump==0){
                return false;
            }
        }

        return true;
    }
}