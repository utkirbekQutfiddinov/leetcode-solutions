class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] largest=new int[nums.length], smallest=new int[nums.length];
        int index=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[index]){
                index=i;
            }
            largest[i]=index;
        }

        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]<nums[index]){
                index=i;
            }
            smallest[i]=index;
        }

        for(int i=0; i<nums.length; i++){
            int stable=nums[largest[i]]-nums[smallest[i]];
            if(stable<=k) return i;
        }

        return -1;

    }
}