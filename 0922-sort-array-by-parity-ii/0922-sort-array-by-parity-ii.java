class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0,j=1,k;

        while(i<nums.length){
            if(nums[i]%2==0){
                i+=2;
            }else if(nums[j]%2!=0){
                j+=2;
            }else {
                k=nums[i];
                nums[i]=nums[j];
                nums[j]=k;
                i+=2;
                j+=2;
            }
        }

        return nums;
    }
}