class Solution {
    public long maxPairStrength(int[] nums) {
        long res=0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=1; j<nums.length; j++){
                long g=gcd(nums[i],nums[j]);
                res=Math.max(nums[i]/g*nums[j]/g,res);
            }
        }
        return res;
    }

    private long gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}