class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freqs=new HashMap<>();
        int freq=0;
        for(int i: nums){
            freq=freqs.getOrDefault(i,0);
            if(freq>=nums.length/2){
                return i;
            }
            freqs.put(i,freq+1);
        }
        return 0;
    }
}