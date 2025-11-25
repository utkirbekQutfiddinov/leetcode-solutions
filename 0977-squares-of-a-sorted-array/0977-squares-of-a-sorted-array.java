class Solution {
    public int[] sortedSquares(int[] nums) {
       int ind=nums.length-1;
        int left=0, right=nums.length-1;
        int[] newNums=new int[nums.length];

        while(ind>=0){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                newNums[ind]=nums[left]*nums[left];
                left++;
                ind--;
            }else {
              newNums[ind]=nums[right]*nums[right];
                right--;
                ind--;  
            }
        }

        return newNums;

    }
}