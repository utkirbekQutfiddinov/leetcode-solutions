class Solution {
    public int pivotIndex(int[] nums) {
        int allSum=0, leftSum=0;
        for(int i: nums){
            allSum+=i;
        }

        for(int i=0; i<nums.length; i++){
            System.out.println("left: "+leftSum+", curr="+nums[i]);
            if(2*leftSum==allSum-nums[i]){
                return i;
            }
                
            leftSum+=nums[i];
            
        }
        return -1;
    }
}