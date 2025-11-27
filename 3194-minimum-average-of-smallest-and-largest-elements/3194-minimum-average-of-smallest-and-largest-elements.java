class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int l=0, r=nums.length-1;
        double minAvg=1000;

        while(l<r){
            minAvg=Math.min(minAvg,0.5*(nums[l]+nums[r]));
            l++;
            r--;
        }
        return minAvg;
    }
}