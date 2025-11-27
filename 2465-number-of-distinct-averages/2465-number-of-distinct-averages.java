class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> res=new HashSet<>();

        Arrays.sort(nums);

        int l=0, r=nums.length-1;

        while(l<r){
            res.add(0.5*(nums[l]+nums[r]));
            l++;
            r--;
        }

        return res.size();
    }
}