class Solution {
    public int minMoves(int[] nums) {
        int maxEl=nums[0];
        for(int num: nums){
            if(num>maxEl){
                maxEl=num;
            }
        }
        int res=0;
        for(int num: nums){
            res+=maxEl-num;
        }
        return res;
    }
}