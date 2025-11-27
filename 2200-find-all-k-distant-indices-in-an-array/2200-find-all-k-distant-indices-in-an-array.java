class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            for(int j=Math.max(0,i-k); j<=Math.min(i+k,nums.length-1); j++){
                if(nums[j]==key){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}