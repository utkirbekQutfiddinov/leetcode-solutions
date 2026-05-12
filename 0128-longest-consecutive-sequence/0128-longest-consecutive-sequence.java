class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> occs=new HashMap<>();
        for(int i: nums){
            if(occs.containsKey(i)){
                continue;
            }
            int prev=occs.getOrDefault(i-1,0);
            occs.put(i,prev+1);
        }

        int res=0;
        for(int i: occs.keySet()){
            res=Math.max(res,occs.get(i));
        }
        return res;
    }
}