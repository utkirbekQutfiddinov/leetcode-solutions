class Solution {
    public int minElement(int[] nums) {
        
        int sum=0;

        for(int i=0; i<nums.length; i++){
            sum=0;
            while(nums[i]>0){
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            nums[i]=sum;
        }

        sum=nums[0];
        for(int i: nums){
            if(i<sum){
                sum=i;
            }
        }

        return sum;
    }
}