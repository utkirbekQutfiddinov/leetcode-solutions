class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> freqs=new HashMap<>();
        int left=0, right=0, currLen=0, maxLen=0;

        while(right<nums.length){
            int rFreq=freqs.getOrDefault(nums[right],0)+1;
            if(rFreq>k){
                int lFreq=freqs.get(nums[left]);
                freqs.put(nums[left],lFreq-1);
                currLen--;
                left++;
            }else{
                currLen++;
                maxLen=Math.max(maxLen, currLen);
                freqs.put(nums[right],rFreq);
                right++;
            }
        }

        return maxLen;
    }
}