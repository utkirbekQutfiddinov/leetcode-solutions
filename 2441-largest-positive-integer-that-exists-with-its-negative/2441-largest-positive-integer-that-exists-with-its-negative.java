class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l=0,r=nums.length-1;

        while(l<r && nums[l]*nums[r]<0){
            if((nums[l]+nums[r])==0){
                return nums[r];
            }else if(-1*nums[l]>nums[r]){
                l++;
            }else {
                r--;
            }
        }

        return -1;
    }
}