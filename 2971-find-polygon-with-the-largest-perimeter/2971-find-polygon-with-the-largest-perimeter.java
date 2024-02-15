class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0, res=-1;
        
        for(Integer i: nums){
            if(i<sum){
                res = i + sum;
            }
            sum = sum + i;
        }
        return res;
    }
}