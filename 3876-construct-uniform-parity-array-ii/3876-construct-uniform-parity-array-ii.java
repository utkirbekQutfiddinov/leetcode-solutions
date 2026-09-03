class Solution {
    public boolean uniformArray(int[] nums) {
        boolean oddFound=false;
        int smallestNum=nums[0];

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==1){
                oddFound=true;
            }
            smallestNum=Math.min(smallestNum, nums[i]);
        }

        return oddFound && smallestNum%2==1 || !oddFound && smallestNum%2==0;
    }
}