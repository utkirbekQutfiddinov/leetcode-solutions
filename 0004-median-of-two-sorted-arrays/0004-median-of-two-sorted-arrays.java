class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged=merge(nums1, nums2);
        
        if(merged.length%2==1){
            return merged[merged.length/2]/1.0;
        }else {
            return (merged[merged.length/2]+merged[merged.length/2-1])/2.0;   
        }
    }
    
    private int[] merge(int[] nums1, int[] nums2){
        int[] res=new int[nums1.length+nums2.length];
        int ind=0;
       for(int i: nums1){
           res[ind++]=i;
       }
         for(int i: nums2){
           res[ind++]=i;
       }
        
        Arrays.sort(res);
        
        return res;
    }
}