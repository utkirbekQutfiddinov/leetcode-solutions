class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++)
            if(map.containsKey(target-nums[i])){
                int[] res=new int[2];
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            } else map.put(nums[i],i);
        
        return new int[1];
    }
}