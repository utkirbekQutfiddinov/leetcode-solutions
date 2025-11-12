class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0; i<nums1.length; i++)
            set1.add(nums1[i]);
        
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0; i<nums2.length; i++)
            if(set1.contains(nums2[i])) set2.add(nums2[i]);
        
        int[] res=new int[set2.size()];
        int ind=0;
        for(Integer in: set2)
            res[ind++]=in;
        return res;
    }
}