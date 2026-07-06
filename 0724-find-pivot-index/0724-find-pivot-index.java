class Solution {
    public int pivotIndex(int[] nums) {
        int allSum=0, currSum=0;
        for(int i: nums){
            allSum+=i;
        }

        for(int i=0; i<nums.length; i++){
            if(2*currSum==(allSum-nums[i])){
                return i;
            }
            currSum+=nums[i];
        }
        return -1;
    }
}