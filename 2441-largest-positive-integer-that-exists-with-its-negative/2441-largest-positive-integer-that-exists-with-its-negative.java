class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> nums1=new HashSet<>();
        int maks=0;
        
        for(int i: nums){
            if(i<0) nums1.add(i);
        }
        
        for(int i: nums){
            if(i>maks && nums1.contains(-1*i)){
                maks=i;
            }
        }
        
        return maks>0?maks:-1;
    }
}