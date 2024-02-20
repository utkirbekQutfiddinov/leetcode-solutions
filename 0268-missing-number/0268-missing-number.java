class Solution {
    public int missingNumber(int[] nums) { 
        int n=nums.length;
        int sum=n*(n+1)/2;
        
        int realSum=0;
        
        for(int i: nums){
            realSum+=i;
        }
        
        return sum-realSum;
    }
}