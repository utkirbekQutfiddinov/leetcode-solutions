class Solution {
    public int minOperations(int[] nums) {
        int temp=nums[0];
        for(int num: nums){
            if(num!=temp){
                return 1;
            }
        }
        return 0;
    }
}