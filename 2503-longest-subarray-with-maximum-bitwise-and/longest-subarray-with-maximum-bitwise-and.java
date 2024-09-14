class Solution {
    public int longestSubarray(int[] nums) {
       int maks=nums[0];
       int uzunlik=0, natija=0;

       for(int i=1; i<nums.length; i++){
        if(nums[i]>maks){
            maks=nums[i];
        }
       }

        for(int i : nums){
            if(i==maks){
                uzunlik++;
            }else {
                if(uzunlik>natija){
                    natija=uzunlik;
                }
                uzunlik=0;
            }
        }

        if(uzunlik>natija){
                    natija=uzunlik;
        }
        return natija;
    }
}