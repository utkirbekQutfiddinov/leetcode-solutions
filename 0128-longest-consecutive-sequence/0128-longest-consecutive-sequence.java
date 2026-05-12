class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> nums1=new HashSet<>();
        for(int i: nums) nums1.add(i);

        int res=0;
        for(int i: nums1){
            if(nums1.contains(i-1)){
                continue;
            }
            int len=1;
            while(nums1.contains(i+len)){
                len++;
            }
            res=Math.max(res,len);
        }
        return res;
    }
}