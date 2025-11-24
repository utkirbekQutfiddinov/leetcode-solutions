class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1=0,p2=0;

        List<Integer> nums=new ArrayList<>();

        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]==nums2[p2]){
                nums.add(nums1[p1]);
                p1++;
                p2++;
            }else if(nums1[p1]>nums2[p2]){
                p2++;
            }else {
                p1++;
            }
        }

        int[] res=new int[nums.size()];

        for(int i=0; i<nums.size(); i++){
            res[i]=nums.get(i);
        }
        return res;
    }
}