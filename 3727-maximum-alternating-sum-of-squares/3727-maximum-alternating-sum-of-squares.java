class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int left=0, right=nums.length-1;
        long sum=0l;
        while(left<right){
            sum+=nums[right]-nums[left];
            right--;
            left++;
        }
        if(left==right) sum+=nums[right];
        return sum;
    }
}