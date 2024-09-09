class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0; i<nums1.length; i++){
            nums1[i]=find(nums2,nums1[i]);
        }
        return nums1;
    }

    private int find(int[] nums, int n){
        int ind=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==n){
                ind=i;
                break;
            }
        }
       
        for(int i=ind; i<nums.length; i++){
            if(nums[i]>nums[ind]){
                return nums[i];
            }
        }
        return -1;
    }
}