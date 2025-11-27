class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
                i++;
            }
        }

        int l=0,k;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                k=nums[l];
                nums[l]=nums[i];
                nums[i]=k;
                l++;
            }
        }

        return nums;
    }
}