class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;

        for(int i=0; i<k; i++){
            sum+=nums[nums.length-i-1]-nums[k-i-1];
        }
        return sum;
    }
}