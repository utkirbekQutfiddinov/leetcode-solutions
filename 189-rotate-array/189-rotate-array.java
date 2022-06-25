class Solution {
    void reverse(int nums[],int left,int right){
         while(left<right){
            int swap=nums[left];
            nums[left]=nums[right];
            nums[right]=swap;
            left++;
            right--;
        }
    }
    
    
    public void rotate(int[] nums, int k) {
        if(k>=nums.length)
            k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
}}