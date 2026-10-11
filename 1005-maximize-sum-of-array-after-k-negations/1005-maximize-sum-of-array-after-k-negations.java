class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
       int n=nums.length;
       Arrays.sort(nums);
       for(int i=0; i<n; i++){
        if(k==0 || nums[i]>=0){
            break;
        }
        nums[i]=-1*nums[i];
        k--;
       }
       int sum=getSum(nums);
       if(k==0 || nums[0]==0) return sum;
       Arrays.sort(nums);
       if(k%2==0) return sum;
       return sum-nums[0]*2;
    }

    private int getSum(int[] nums){
        int sum=0;
        for(int num: nums){
            sum+=num;
        }
        return sum;
    }

}