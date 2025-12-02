class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Set<Integer> s=new HashSet<Integer>();

        int l=0, r=0;

        while(r<nums.length && l<=r){
            if(s.contains(nums[r])){
                return true;
            }

            if(r-l<k){
                s.add(nums[r]);
                r++;
            }else {
                s.remove(nums[l]);
                l++;
            }

        }

        return false;
    }
}