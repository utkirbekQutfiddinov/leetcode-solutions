class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minEl=nums[0], maxEl=nums[0];

        for(int num: nums){
            if(num<minEl){
                minEl=num;
            }

            if(num>maxEl){
                maxEl=num;
            }
        }

        int diff=maxEl-minEl;
        if(diff>2*k){
            return diff-2*k;
        }else {
            return 0;
        }
    }
}