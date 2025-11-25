class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0,p2=1;

        while(p2<nums.length){
            if(nums[p1]==nums[p2]){
                p2++;
            }else {
                nums[++p1]=nums[p2++];
            }
        }
        
        return p1+1;
    }
}