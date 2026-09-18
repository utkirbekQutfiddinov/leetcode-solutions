class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        int sum=0;
        int maxNum=nums[0];
        for(int num: nums){
            if(num>0 && !seen.contains(num)){
                sum+=num;
            }
            maxNum=Math.max(maxNum, num);
            seen.add(num);
        }

        return sum==0?maxNum:sum;
    }
}